# Ханойские башни
## Реализация игры Ханойские башни в консольном исполнении.

Все классы защищены от видимости и взаимодействия  пакетом game. 

Внутри пакета распологается 4 класса: 
* Ring;
* Tower;
* Game;
* GameController.

## Ring - класс обертка вокруг int переменной. Создан с заделом на будущее, так как в дальнейшем планируется расширение на графический интерфейс. 

Поля:
* final(int)number - порядковый номер кольца
* final(int)size - размер кольца (задел на будущее)

Методы:
* (int)getNumber() - возвращает порядковый номер кольца.

## Tower - класс содержаший в себе стек объектов класса ринг. 

Поля:
* (Stack<Ring>)ringList - стек содерзащий в себе объекты класса Ring.

Методы:
* (void)addRing(Ring ring) - положить в стек кольцо;
* (void)remRing() - убрать кольцо если таковое присутствует в стеке;
* (boolean)towerIsEmpty() - проверка наличия в стеке объектов;
* (Ring)getRing() - возращает последний объект из стека;
* (void)printTower() - печатает в консоль номер башни и все объекты из стека этой бащни;
* compareTo - перегрузка интерфейса Comparable для сравнения объектов из стеков разных башен.

## Game - класс содержащий игровую логику
  
Поля:
* (Tower[])towers - массив из 3-х бащен
  
Методы:
* (void)InitGame(int numRings) - инициализация игры с созданием всех игровых объектов. На вход принимается количество колец в игре;
* (void)printGame() - вывести в консоль башни и кольца на них;
* (boolean)getEndGameStatus() - возвращает момент когда условия победы били соблюдены (трикгер попбеды условно);
* (void)moveRing(int inTower, int toTower) - перемещает кольцо с башни на бащню. На вход принимаются номера бащен.
  
## GameController - класс для взаимодействия с игроком.
  
Поля:
* (Scanner)scanner - сканер для считывания команд;
* (Game)game - элемент класса игры;
* (int)numRing - переменная для хранения количество колец в игре;
* (String)keyWrite - переменная для хранения последней введенной команды;
* (boolean)isExit - триггер выхода из игры.

Методы:
* (void)startMenu() - отрисовка и выбор пунктов меню;
* (void)newGame() - созание новой игры с запросом параметров для запуска;
* (void)startGame() - Запуск игры и взаимодействие с игроком;
* (boolean)isDigit(String s) - проверка ввода на начиличе числового ввода;
* (void)sayRule() - вывод в консоль правил игры.

Игра запускается при создании экземпляра класса GameController.
  
P.S. В дальнейшем планируется добавить графический интерфейс.
