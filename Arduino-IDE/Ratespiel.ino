/*
  Rate-Spiel
  
*/

int status = 0;    // DEFINITION der Variablen
int eingabe = 0;
int zahl = 5;    //Versuch -> später durch Zufall
int versuche = 0;
int sensorPin = A0;

int sensorValue = 0;
#define poti 0
int potiwert;

int KnopfPin = A1;


//-------------------------------------
//---Methoden für die Zahl-AUSGABE-----
//-------------------------------------
void Null(){  // ZAHL NULL AUSGEBEN
  digitalWrite(8, LOW);
  digitalWrite(9, HIGH);
  digitalWrite(10, HIGH);
  digitalWrite(11, HIGH);
  digitalWrite(12, HIGH);
  digitalWrite(13, HIGH);
  digitalWrite(0, HIGH);
}

void EINS(){  // ZAHL EINS AUSGEBEN
  digitalWrite(8, LOW);
  digitalWrite(9, LOW);
  digitalWrite(10, LOW);
  digitalWrite(11, HIGH);
  digitalWrite(12, LOW);
  digitalWrite(13, LOW);
  digitalWrite(0, HIGH);
}


void ZWEI(){  // ZAHL ZWEI AUSGEBEN
  digitalWrite(8, HIGH);
  digitalWrite(9, LOW);
  digitalWrite(10, HIGH);
  digitalWrite(11, HIGH);
  digitalWrite(12, HIGH);
  digitalWrite(13, HIGH);
  digitalWrite(0, LOW);
}

void DREI(){  // ZAHL DREI AUSGEBEN
  digitalWrite(8, HIGH);
  digitalWrite(9, LOW);
  digitalWrite(10, HIGH);
  digitalWrite(11, HIGH);
  digitalWrite(12, LOW);
  digitalWrite(13, HIGH);
  digitalWrite(0, HIGH);
}

void VIER(){  // ZAHL VIER AUSGEBEN
  digitalWrite(8, HIGH);
  digitalWrite(9, HIGH);
  digitalWrite(10, LOW);
  digitalWrite(11, HIGH);
  digitalWrite(12, LOW);
  digitalWrite(13, LOW);
  digitalWrite(0, HIGH);
}


void FUENF(){  // ZAHL FUENF AUSGEBEN
  digitalWrite(8, HIGH);
  digitalWrite(9, HIGH);
  digitalWrite(10, HIGH);
  digitalWrite(11, LOW);
  digitalWrite(12, LOW);
  digitalWrite(13, HIGH);
  digitalWrite(0, HIGH);
}


void SECHS(){  // ZAHL SECHS AUSGEBEN
  digitalWrite(8, HIGH);
  digitalWrite(9, HIGH);
  digitalWrite(10, HIGH);
  digitalWrite(11, LOW);
  digitalWrite(12, HIGH);
  digitalWrite(13, HIGH);
  digitalWrite(0, HIGH);
}

void SIEBEN(){  // ZAHL SIEBEN AUSGEBEN
  digitalWrite(8, LOW);
  digitalWrite(9, HIGH);
  digitalWrite(10, HIGH);
  digitalWrite(11, HIGH);
  digitalWrite(12, LOW);
  digitalWrite(13, LOW);
  digitalWrite(0, HIGH);
}


void ACHT(){  // ZAHL ACHT AUSGEBEN
  digitalWrite(8, HIGH);
  digitalWrite(9, HIGH);
  digitalWrite(10, HIGH);
  digitalWrite(11, HIGH);
  digitalWrite(12, HIGH);
  digitalWrite(13, HIGH);
  digitalWrite(0, HIGH);
}

void NEUN(){  // ZAHL NEUN AUSGEBEN
  digitalWrite(8, HIGH);
  digitalWrite(9, HIGH);
  digitalWrite(10, HIGH);
  digitalWrite(11, HIGH);
  digitalWrite(12, LOW);
  digitalWrite(13, HIGH);
  digitalWrite(0, HIGH);
}

void  Kalibrieren(){  // Kalibrieren == Anzeige/Grafik ZURÜCKSETZEN
  digitalWrite(8, HIGH);
  digitalWrite(9, LOW);
  digitalWrite(10, LOW);
  digitalWrite(11, LOW);
  digitalWrite(12, LOW);
  digitalWrite(13, LOW);
  digitalWrite(0, LOW);
  delay(100);
  
  digitalWrite(8, LOW);
  digitalWrite(9, HIGH);
  delay(100);
  digitalWrite(3, HIGH);
  
  digitalWrite(9, LOW);
  digitalWrite(10, HIGH);
  delay(100);
  digitalWrite(4, HIGH);
  
  digitalWrite(10, LOW);
  digitalWrite(11, HIGH);
  delay(100);
  digitalWrite(5, HIGH);
  
  digitalWrite(11, LOW);
  digitalWrite(12, HIGH);
  delay(100);
  digitalWrite(3, HIGH);
  digitalWrite(4, HIGH);
  digitalWrite(5, HIGH);
  digitalWrite(12, LOW);
  digitalWrite(13, HIGH);
  delay(100);
  digitalWrite(3, LOW);
  digitalWrite(4, LOW);
  digitalWrite(5, LOW);
  digitalWrite(13, LOW);
  digitalWrite(0, HIGH);
  delay(100);
  digitalWrite(0, LOW);
  delay(100);
  digitalWrite(3, HIGH);
  digitalWrite(4, HIGH);
  digitalWrite(5, HIGH);
  versuche = 0;
  zahl= random(10);    //  !!!!!!!!!!!Zufalls-Zahl!!!!!!!!!!!!!!!
  Serial.println("Zufallszahl:" + zahl);

  
}







void setup() {                       //SETUP
  Serial.begin(9600);
  pinMode(0, OUTPUT);
  pinMode(2, OUTPUT);
  pinMode(3, OUTPUT);
  pinMode(4, OUTPUT);
  pinMode(6, OUTPUT);
  pinMode(7, OUTPUT);
  pinMode(8, OUTPUT);
  pinMode(9, OUTPUT);
  pinMode(10, OUTPUT);
  pinMode(11, OUTPUT);
  pinMode(12, OUTPUT);
  pinMode(13, OUTPUT);
  pinMode(1, OUTPUT);
  digitalWrite(0, LOW);
  digitalWrite(1, LOW);

  pinMode(5, INPUT);


  //VERSUCHSANZEIGE
  digitalWrite(2, HIGH);
  digitalWrite(3, HIGH);
  digitalWrite(4, HIGH); 
  Kalibrieren();

  
}



//--------------------------
//------PROGRAMM-START------
//--------------------------

void loop() {       

  /*
  digitalWrite(2, HIGH);   // turn the LED on (HIGH is the voltage level)                  FUNKTIONSTEST aller Komponenten
  delay(1000);                       // wait for a second
  digitalWrite(2, LOW);    // turn the LED off by making the voltage LOW
  delay(1000);
  digitalWrite(3, HIGH);   // turn the LED on (HIGH is the voltage level)
  delay(1000);                       // wait for a second
  digitalWrite(3, LOW);    // turn the LED off by making the voltage LOW
  delay(1000); 
  digitalWrite(4, HIGH);   // turn the LED on (HIGH is the voltage level)
  delay(1000);                       // wait for a second
  digitalWrite(4, LOW);    // turn the LED off by making the voltage LOW
  delay(1000); // wait for a second


  digitalWrite(6, HIGH);   // turn the LED on (HIGH is the voltage level)
  delay(1000);                       // wait for a second
  digitalWrite(6, LOW);    // turn the LED off by making the voltage LOW
  delay(1000); // wait for a second
  digitalWrite(6, HIGH);   // turn the LED on (HIGH is the voltage level)
  delay(1000);
  digitalWrite(7, HIGH);   // turn the LED on (HIGH is the voltage level)
  delay(1000);                       // wait for a second
  digitalWrite(6, LOW);    // turn the LED off by making the voltage LOW
  delay(1000); // wait for a second

                        // wait for a second
  digitalWrite(7, LOW);    // turn the LED off by making the voltage LOW
  delay(1000); // wait for a second

  for (int i=0; i <= 10; i++){
  digitalWrite(1, HIGH);   // HIGHSCORE
  delay(200);                       
  digitalWrite(1, LOW);   
  delay(200);
  i = i+1;
  }
*/








 sensorValue = analogRead(sensorPin);                    // ABFRAGE Poti und autom. Anzeige auf Display
 if (sensorValue >0 && sensorValue < 70 ) {
     Null();
     eingabe = 0;
  }


if (sensorValue >70 && sensorValue < 140 ) {
    EINS();
    eingabe = 1;
  }

if (sensorValue >140 && sensorValue < 210 ) {
    ZWEI();
    eingabe = 2;
  }


if (sensorValue >210 && sensorValue < 280 ) {
   DREI();
   eingabe = 3;
  }

if (sensorValue >280 && sensorValue < 350 ) {
     VIER();
     eingabe = 4;
  }

if (sensorValue >350 && sensorValue < 420 ) {
    FUENF();
    eingabe = 5;
  }

if (sensorValue >420 && sensorValue < 490 ) {
    SECHS();
    eingabe = 6;
  }

if (sensorValue >490 && sensorValue < 560 ) {
    SIEBEN();
    eingabe = 7;
  }

if (sensorValue >560 && sensorValue < 630 ) {
    ACHT();
    eingabe = 8;
  }

if (sensorValue >560 && sensorValue < 700 ) {
    NEUN();
    eingabe = 9;
  }


status = digitalRead(A1);                           //Wenn EINGABEKNOPF gedrückt wird
if (status == HIGH) {
Serial.println("Usereingabe:" + eingabe);      // EINGABE auf dem seriellen Monitor


    if (eingabe == zahl){       //RICHTIGE WAHL
      digitalWrite(7, HIGH);  
      delay(3000);
      digitalWrite(7, LOW);
      Kalibrieren();
      Kalibrieren();
      Kalibrieren();
      
    }
     else if (eingabe == (zahl+1)){             //AUSGABE auf RGB LED  Falsch - Fast - Richtig
      digitalWrite(6, HIGH);
      digitalWrite(7, HIGH);  
      delay(1000);
      digitalWrite(6, LOW);
      digitalWrite(7, LOW);
      versuche = versuche +1;
    }
     else if (eingabe == (zahl-1)){
      digitalWrite(6, HIGH);
      digitalWrite(7, HIGH);  
      delay(1000);
      digitalWrite(6, LOW);
      digitalWrite(7, LOW);
      versuche = versuche +1;
    }
    else{
      digitalWrite(6, HIGH);    //FALSCH
      delay(1000);
      digitalWrite(6, LOW);
      versuche = versuche +1;
      
    }

  switch (versuche) {                      //ANZAHL DER VERSUCHE und leuchten der LEDs
    case 0:
      digitalWrite(2, HIGH);
      digitalWrite(3, HIGH);
      digitalWrite(4, HIGH); 
      break;
    case 1:
       digitalWrite(2, HIGH);
       digitalWrite(3, HIGH);
       digitalWrite(4, LOW); 
      break;
    case 2:
       digitalWrite(2, HIGH);
       digitalWrite(3, LOW);
       digitalWrite(4, LOW);
      break;
    case 3:
       digitalWrite(2, LOW);
       digitalWrite(3, LOW);
       digitalWrite(4, LOW);
       //---------------
       digitalWrite(8, HIGH);
       digitalWrite(9, LOW);
       digitalWrite(10, HIGH);
       digitalWrite(11, LOW);
       digitalWrite(12, HIGH);
       digitalWrite(13, LOW);
       digitalWrite(0, HIGH);
       delay(3000);
       Kalibrieren();
       versuche = 0 ;
       digitalWrite(2, HIGH);
       digitalWrite(3, HIGH);
       digitalWrite(4, HIGH); 
       break;
      
    default:
       //digitalWrite(2, LOW);
       //digitalWrite(3, LOW);
       //digitalWrite(4, LOW);
       //versuche = 3;
    break;
  }

}



  
}


