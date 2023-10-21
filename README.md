# Santander Bootcamp 2023 - Java Backend
Uma RESTful API criada através do Santander Bootcamp 2023 - Java Backend.

## Diagrama de Classes
```mermaid
classDiagram
    class User {
        -String: name
        -Account: account
        -Feature[]: features
        -Card: card
        -News[]: news
    }

    class Account {
        -String: String
        -String: agency
        -Number: balance
        -Number: limit
    }

    class Feature {
        -String: icon
        -String: description
    }

    class Card {
        -String: number
        -Number: limit
    }

    class News {
        -String: icon
        -String: description
    }

    User "1" *-- "1" Account
    User "1" *-- "N" Feature
    User "1" *-- "1" Card
    User "1" *-- "N" News
```
