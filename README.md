# GoF_Facade

Façade
Objetivo: 
"Oferecer uma interface única para um conjunto de interfaces de um subsistema.
Façadedefine uma interface de nível mais elevado que torna o subsistema mais fácil de usar." [GoF]
O Padrão de Projeto Facade oculta toda a complexidade de uma ou mais classes através de uma Facade (Fachada). A intenção desse Padrão de Projeto é simplificar uma interface.
Ele fornece uma interface simplificada para acessar as suas funcionalidades.Tendo uma Facade precisamos apenas construir um método que agrupe todas as classes e chame todos os métodos.


Como utilizar o componente reutilizável:
Através da importação explícta ou implícita.

Importação Explícita
A importação explícita é utilizada para importar uma classe específica do pacote.
Por exemplo: 
import GoFReutilizaveis.Estadia;
Sendo GofReutilizaveis o pacote
Sendo Estadia uma classe do pacote.

Importação Implícita
A importação implícita é utilizada para importar todas as classes do pacote para sua classe sem declarar a importação uma por uma.
Por exemplo:
GoFReutilizaveis.*



