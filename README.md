# Tech Hiring Solutions

Repositório de soluções para desafios de HackerRank, LeetCode e outras plataformas em Java e SQL.

## Estrutura do Repositório

```markdown
/tech-hiring-solutions
├── README.md
├── LICENSE
├── src
│ ├── main
│ │ └── java
│ │ └── br
│ │ └── com
│ │ └── mulero
│ │ ├── hackerrank
│ │ │ └── SolutionN.java
│ │ ├── leetcode
│ │ │ └── SolutionN.java
├── sql
│ ├── hackerrank
│ │ ├── easy
│ │ │ └── QueryN.sql
│ │ ├── medium
│ │ │ └── QueryN.sql
│ │ ├── hard
│ │ │ └── QueryN.sql
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