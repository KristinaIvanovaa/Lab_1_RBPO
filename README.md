# Spring Boot Lab

Небольшое REST-приложение на Spring Boot 3.5.5 и Maven.

## Запуск

Требуются Java 17 и Maven.

```bash
mvn spring-boot:run
```

## Эндпоинты

- `GET /api/hello` возвращает текст `Hello from Spring Boot`.
- `GET /api/numbers` возвращает JSON-массив `[1,2,3,4,5]`.

Перед сдачей замените `YOUR_STUDENT_ID` в `src/main/resources/application.yml` на номер своей зачётной книжки.