package Lesson3.SRP;
// Нарушение принципа SRP

class SRP {
  public void authenticateUser(String username, String password) {
    // Логика аутентификации пользователя
  }

  public void saveUser(User user) {
    // Логика сохранения данных пользователя
  }

  public void generateUserReport(User user) {
    // Логика генерации отчета о пользователе
  }
}

// Соблюдение принципа SRP

class UserRepository {
  public void saveUser(User user) {
    // Логика сохранения данных пользователя
  }
}

class UserAuthenticator {
  public void authenticateUser(String username, String password) {
    // Логика аутентификации пользователя
  }
}

class UserReportGenerator {
  public void generateUserReport(User user) {
    // Логика генерации отчета о пользователе
  }
}
//В данном примере класс UserService нарушает принцип SRP, так как он отвечает за несколько различных задач:
// аутентификацию пользователей, сохранение данных пользователей и генерацию отчетов о пользователях.
//Для соблюдения принципа SRP, функционал работы с данными пользователей был вынесен в класс UserRepository, 
//функционал аутентификации пользователей - в класс UserAuthenticator, а функционал генерации отчетов - в класс UserReportGenerator.
// Теперь каждый класс отвечает только за свою одну задачу, и принцип SRP соблюдается.