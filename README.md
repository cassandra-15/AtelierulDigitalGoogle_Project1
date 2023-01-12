Se considera o cafenea care are pe lista de vanzare urmatoarele produse:"Espresso", "Espresso Machiato", "Cappucino", "Americano", "Flat White". 
Am creat o clasa Coffe care prezinta atribute ca: typeCoffe, price, typeEspresso(cazuri doar pentru Espresso:simplu sau Machiato), hasSugar, hasMilk.
Se doreste ca de fiecare data cand exista o vanzare, prin constructia unui obiect, sa nu se precizeze toate atributele.
Astfel, am folosit Builder design pattern pentru a usura munca in care trebuie precizata de fiecare data fiecare detaliu. Se vor face comenzi in functie de preferintele cerute, celelalte atribute fiind optionale.
De exemplu, se cere o cafea Americano, cu zahar. Obiectul construit va avea forma " Coffe coffe3=new Coffe.UserBuilder("Americano",5).hasSugar(true).build();"

Thank u!:D
