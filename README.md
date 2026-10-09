# Kontoappen
Ska kunna visa en meny där användare kan skapa konto, se saldo, göra insättning/uttag från konto, lista och söka på befintliga konton.

## Köra
JDK + IDE. Main.

## Teori
### 1. Inkapsling
Konstruktorn ligger i Account som anger vilka krav för att skapa konto, för att genomföra. När kraven uppfylls lagras info i AccountRegister som också kan lämna ut info vid anrop ifrån main. De olika filerna har olika uppgifter och kommunicerar med varandra. Blir det fel i något steg så fortsätter inte anropet till nästa fil och det är svårare att manipulera koden.

### 2. Factory
Kontot skapas via anrop till construktor för att informationen ska lagras och inte kunna manipuleras i efterhand. När ett konto är skapat så kan det inte ändras. Hade kontot skapats direkt i main hade det varit enkelt att byta ut uppgifterna.

### 3. Stegkedja — ett menyval
Menyval 1 createAccount 
Checkar AccountRegister om kontot redan finns, om inte fortsätter den till att be om startsumma för kontot
AccountRegister anropar construktorn i Account som berättar vilken information som krävs
Kontot registreras i AccountRegister som lagrar informationen
Main printar info genom att anropa info från AccountRegister

## AI-reflektion
AI är bra för att justera redan skriven kod och felsöka. Inte bra för att skiva koden från början.

## Muntligt — mina 2–3 delar
1. fil + vad jag pekar på
2. …
3. … (VG: SavingsAccount)
