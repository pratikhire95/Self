package JDBCSBA;

public class MovieDAO {
 
    private Connection;
 
    public MovieDAO() {
        try {
            connection = DatabaseConnection.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
 
    // Create a Movie record
     void createMovie(Movie movie) {
        String sql = "INSERT INTO Movies(movieName, movieFeedback) VALUES (?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, movie.getMovieName());
            statement.setString(2, movie.getMovieFeedback ());
            statement.executeUpdate();
 
            ResultSet generatedKeys = statement.getGeneratedKeys();
            if (generatedKeys.next()) {
                movie.setMovieID(generatedKeys.getInt(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
 
     Movie getMovieByID(int MovieID) throws RecordNotFoundException {
        String sql = "SELECT * FROM Movies WHERE movieID = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, movieID);
            ResultSet resultSet = statement.executeQuery();
 
            if (resultSet.next()) {
                Movie movie = new Movie();
                movie.setMovieID(resultSet.getInt("movieID"));
                movie.setMovieName(resultSet.getString("movieName"));
                movie.setMovieFeedback(resultSet.getString("movieFeedback"));
                return movie;
            } else {
                throw new RecordNotFoundException("Movie with ID " + getMovieID() + " not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
 
     void close() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
