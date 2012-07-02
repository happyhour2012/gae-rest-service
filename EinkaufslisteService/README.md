Einkaufsliste-Service Using JAX-RS (Java API for RESTful Web Services)
==========================================================================
Authors: Rémy Schumm for HappyHour 2012

Ein- und Ausgabe ist "application/json"


Benutzung: 
-----------

GET: 

http://localhost:8080/helloworld-rs/einkaufslisten/
liefert alle Einkauflisten


http://localhost:8080/helloworld-rs/einkaufslisten/count
liefert die Anzahl Listen die es gibt


http://localhost:8080/helloworld-rs/einkaufslisten/bla
sucht und liefert eine Einkaufliste, die im Namen "bla" hat

POST: 
speichert eine Einkaufsliste