Einkaufsliste-Service Using JAX-RS (Java API for RESTful Web Services)
==========================================================================
Authors: Remy Schumm for HappyHour 2012

Ein- und Ausgabe ist: 
Content-Type: application/json


Benutzung: 
-----------

GET: 

http://localhost:8080/EinkaufslisteService/einkaufslisten/
liefert alle Einkauflisten


http://localhost:8080/EinkaufslisteService/einkaufslisten/count
liefert die Anzahl Listen die es gibt


http://localhost:8080/EinkaufslisteService/einkaufslisten/bla
sucht und liefert eine Einkaufliste, die im Namen "bla" hat


POST: 
http://localhost:8080/EinkaufslisteService/einkaufslisten/
speichert eine Einkaufsliste, die mit JSON übergeben wird. 
z.B: 
Content-Type: application/json

Body: 
{"titel":"Coop"}




DELETE: 
http://localhost:8080/EinkaufslisteService/einkaufslisten/bla
löscht die Einkaufliste, die genau "bla" heisst

