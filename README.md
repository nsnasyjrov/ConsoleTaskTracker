Простейшее приложение на Java, реализующее функции создания, чтения, обновления и удаления задач в рамках консоли CLI:

#### Используемые технологии:
Язык программирования - Java;
Фреймворки: Hibernate;
Система сборки: Maven;
СУБД: MySQL;

## Зависимости

Все зависимости проекта указаны в файле `pom.xml`. Основные зависимости включают:

- **Hibernate Core**
    
- **MySQL-Connector-java**
    
- **Hibernate Entity Manager**

---

## Установка и настройка

### Требования

Перед запуском программы убедитесь, что у вас установлены следующие компоненты:

1. **Java Development Kit (JDK)** версии 8 или выше.
2. **MySQL** сервер для хранения данных.

---

### Шаги для запуска

#### 1. Клонирование репозитория

Склонируйте репозиторий на свой локальный компьютер:
```
git clone <URL_репозитория>
cd <имя_папки_проекта>
```
#### 2. Настройка базы данных

1. Убедитесь, что MySQL сервер запущен.
2. Введите корректные данные(username, password), проверьте подключение в resources\hibernate.cfg.xml
![Pasted image 20241214194327](https://github.com/user-attachments/assets/ef434246-afef-461a-8350-11cbb16381a2)
3. Аналогичное проделайте в src\Project\Database\DatabaseInitializer
![Pasted image 20241214194518](https://github.com/user-attachments/assets/42f62660-a287-4683-8c94-622e7984fbb4)
4. Запустите программу, убедившись, что все данные 
![Pasted image 20241214194732](https://github.com/user-attachments/assets/c956fdc6-95f6-4579-b94f-399ed8047760)

## Резюме проекта
Программа представляет собой простейшее консольное приложение для управления задачами (Task Manager), которое реализует функции создания, чтения, обновления и удаления задач (CRUD). Программа разработана с использованием принципов объектно-ориентированного программирования (ООП) и использует ORM-фреймворк Hibernate для взаимодействия с базой данных MySQL.

### Основные характеристики программы
Принципы ООП:
Программа соблюдает принципы объектно-ориентированного программирования, такие как инкапсуляция, наследование и полиморфизм.
Логика работы с базой данных инкапсулирована в классе TaskControlMethods, а взаимодействие с пользователем — в классе ControlPanel.

Использование ORM (Hibernate):
Программа использует Hibernate для работы с базой данных MySQL.
Hibernate автоматически генерирует SQL-запросы для выполнения CRUD-операций.

Функциональность:
Создание задачи: Пользователь вводит описание задачи, и она сохраняется в базе данных.
Чтение задачи по ID: Пользователь вводит ID задачи, и приложение выводит её описание и статус.
Чтение всех задач: Приложение выводит список всех задач в базе данных.
Обновление задачи: Пользователь может обновить описание или статус задачи.
Удаление задачи: Пользователь вводит ID задачи, и она удаляется из базы данных.

Интерфейс командной строки (CLI):
Программа предоставляет консольный интерфейс для взаимодействия с пользователем.
Пользователь может выбирать действия из меню, вводить данные и получать результаты.

База данных:
Программа использует базу данных MySQL для хранения задач.
Таблица mytasks хранит информацию о задачах, а таблица deleted_ids используется для переиспользования идентификаторов задач.
