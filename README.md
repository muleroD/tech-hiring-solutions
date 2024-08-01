# Tech Hiring Solutions

Repositório de soluções para desafios de HackerRank, LeetCode e outras plataformas em Java e SQL.

## Estrutura do Repositório

```
/tech-hiring-solutions
├── README.md
├── LICENSE
├── /src
│ ├── /main
│ │ └── /java
│ │ └── /br
│ │ └── /com
│ │ └── /mulero
│ │ ├── /hackerrank
│ │ │ └── SolutionN.java
│ │ ├── /leetcode
│ │ │ └── SolutionN.java
├── /sql
│ ├── /hackerrank
│ │ ├── easy
│ │ │ ├── Query1.sql
│ │ │ └── Query2.sql
│ │ ├── medium
│ │ │ ├── Query1.sql
│ │ │ └── Query2.sql
│ │ ├── hard
│ │ ├── Query1.sql
│ │ └── Query2.sql
│ ├── /leetcode
│ │ ├── easy
│ │ │ ├── Query1.sql
│ │ │ └── Query2.sql
│ │ ├── medium
│ │ │ ├── Query1.sql
│ │ │ └── Query2.sql
│ │ ├── hard
│ │ ├── Query1.sql
│ │ └── Query2.sql
└── pom.xml
```

## Como Usar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/tech-hiring-solutions.git
   ```

2. Navegue até o diretório desejado e compile/execute a solução Java:
   ```bash
   cd tech-hiring-solutions/src/main/java/br/com/mulero/hackerrank
   javac BirthdayCakeCandles.java
   java BirthdayCakeCandles
   ```
   Ou execute a query SQL:
   ```bash
   cd tech-hiring-solutions/sql/hackerrank/easy
   cat Query1.sql | sqlite3 your_database.db
   ```

## Licença

Este projeto está licenciado sob a licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.