# State pattern 

### Description
Является одним из поведенческих паттернов проектирования. 

### Goal
Паттерн State позволяет объекту изменять свое поведение, в зависимости от внутреннего состояния. Извне создается впечатление, что изменился класс объекта

### Use for
● Если есть объект, поведение которого кардинально меняется в зависимости от внутреннего состояния, причем типов состояний много, а их код часто меняется.<br>
● Если код класса содержит множество больших, похожих друг на друга условных операторов, которые выбирают поведения в зависимости от текущих значений полей класса.<br>

### Pros
● Решает проблему создания громоздких конструкций с условными операторами, характеристикой которых является низкая гибкость, что препятствует расширению и модификации.<br>
● Делает переход состояния более явным. Так как изменение внутреннего состояния (значений переменных) никак обычно не отражается, то<br>
● Концентрирует в одном месте код, связанный с определенным состоянием.<br>

### Cons
● Возникает дублирование функционала в различных подклассах и увеличивается само количество подклассов.



 

