Trabalho de Engenharia de Software II - Padrões de Projeto (interpreter)
Instituição: Faculdade Senac RS
Disciplina: Engenharia de Software 2
Entrega: 25/11/2025
Categoria de Padrões: (Interpreter)

🟦 Integrante do Grupo

Nome: Claudio Roberto Oliveira Volz

🎯 Objetivos do projeto
- Mostrar um exemplo **sem o padrão** (uma solução rígida e difícil de manter).  
- Mostrar uma solução **com o padrão Interpreter**, didática e extensível.  
- Explicar quando usar, pontos fortes e fracos e conclusão final.

- Esse material foi baseado tanto no livro GoF quanto no slide enviado pelo professor.

- 🧩 Quando utilizar
Use o Interpreter quando:

✔ Existe uma *linguagem simples* a ser interpretada.  
✔ Regras podem ser representadas como classes.  
✔ A gramática não muda com frequência.  
✔ É desejável separar parsing, lógica e avaliação.


Não use quando:

✘ A gramática é gigante ou muda sempre.  
✘ O desempenho é crítico.  
✘ O custo de criar muitas classes for maior que o benefício.


##### Exemplo Main.java sem padrão GOF #####

veja o arquivo `sem_pattern/Main.java`

🚨 Problemas:

Lógica de parsing + regras + execução tudo no mesmo método.

Difícil adicionar novos operadores.

Testes são limitados.

A solução quebra princípios de OO (SRP, OCP etc.).

✅ Exemplo Com o Padrão Interpreter
Interface base — `com_pattern/Expression.java`

✅ Expressões Terminais `com_pattern/NumberExpression.java`

✅ Expressões não Terminais `com_pattern/AddExpression.java`

✅ Subtração `com_pattern/SubtractExpression.java`

✅ Multiplicação `com_pattern/MultiplyExpression.java`

✅ Divisão `com_pattern/DivideExpression.java`

✅ Parser Simples `com_pattern/Parser.java`

✅ Execução `com_pattern/Main.java`


📊 Pontos Fortes e Fracos
✅ Pontos Fortes

Fácil de testar cada regra isoladamente.

Extensível: adicionar um novo operador não quebra código existente.

Representa expressões como árvores (AST), favorecendo composição.

Boa aderência ao SRP (responsabilidade única).

❌ Pontos Fracos

Pode gerar MUITAS classes conforme a gramática aumenta.

Não é ideal para linguagens complexas.

Exige um parser (que pode se tornar complexo).

Pode impactar performance em recursões profundas.

💡💡💡 Considerações Finais 💡💡💡

O padrão Interpreter se mostrou uma solução eficiente para lidar com linguagens pequenas e regras de negócio expressas como expressões. Ele permite uma separação clara entre gramática, parsing e execução, tornando o código mais coeso, extensível e testável.

Entretanto, observa-se  que seu uso não é recomendado quando a linguagem é muito grande ou muda frequentemente, pois produz um número elevado de classes e um parser complexo. Nesses casos, ferramentas como ANTLR, regex avançadas ou parsers especializados são alternativas mais adequadas.

Para o problema escolhido, o padrão trouxe clareza, facilidade de manutenção e uma representação estruturada do processo de interpretação.

**Conclusão:**  
Interpreter é excelente para DSLs simples, mas deve ser usado com cautela em projetos de grande escala.
