# MySql-Hibernate-Java

W celu uruchomienia programu należy:

1.  Uruchomić Docker Quickstart Terminal
2.  Za pomocą komendy cd "..." wprowadzić ścieżkę do pliku docker-compose.yml i potwierdzić 	klikając "Enter"
3.  Następnie, wprowadzić komendę docker-compose up w terminalu docker-a i zatwierdzić "Enterem".
4.  Uruchom MySQL Workbench (narzędzie do zarządzania i modelowania baz danych).
6.  Otwórz/Dodaj nowe połączenie w panelu głównym.
7.  Wprowadź nazwę połączenia (może być to np nazwa bazy danych).
8.  Ustaw port, tożsamy z wartością zapisaną w pliku docker-compose.yml.
9.  Wprowadź "Username",może być "root" lub tożsame z wartością podaną w pliku docker-compose.yml.
10. Podaj "Password", identyczne z tym zapisanym w pliku docker-compose.yml.
11. Zatwierdź klikając "Test connection".

Po utworzeniu nowej bazy danych i połączeniu z nią, należy zaimportować skrypt bazy danych.
Adres odnośnika do skryptu:
https://sp.mysqltutorial.org/wp-content/uploads/2018/03/mysqlsampledatabase.zip
Pobrany plik należy "rozpakować" (np za pomocą programu winRAR) w dowolne miejsce na dysku.
Następnie, przejdź do MySQL Workbench i kliknij "Open a SQL script file" na pasku zadań.
Znajdż skrypt i zaimportuj klikając "Otwórz".
Po zaimportowaniu, zaznacz całość Ctr+A oraz kliknij "Execute the selected portion of the script" inaczej ikona pioruna na pasku narzędzi.
Następnie należy odświeżyć nowo utworzoną bazę danych klikając ikonę "Odśwież" w lewym oknie o oznaczeniu SCHEMAS.
W tym momencie należy stworzyć własne, lokalne repozytorium projektu Sql-Hibernate-Java
Następnie, zaimportuj projekt do IDE (Eclipse, IntelliJ).
Procedura importowania projektu na przykładzie Eclipse:
1. Otwórz IDE Eclipse.
2. Wybierz File/Import
	W oknie wybierz: Existing Maven Projects
	Następnie w "Root Directory" kliknij Browse i wskaż ścieżkę do folderu głównego gdzie zostało utworzone repozytorium lokalne projektu.
	Po pojawieniu się okna z zaznaczonum plikiem pom.xml kliknij "Finish".
	
Dobra robota, stworzyłeś/łaś nową bazę danych oraz połączyłeś/łaś z nią swój projekt.
Możesz teraz iść zrobić sobie kawę, Eclipse w międzyczasie zaimportuje wszystkie wskazane biblioteki.
