# Directori
**Descripció**: Sprint 1, Tasca 5

## 📌 Nivells 1 al 3, tots els exercicis
```
En aquest primer nivell, treballarem amb algunes de les utilitats bàsiques de Java per gestionar fitxers i directoris, així com per llegir i escriure informació al sistema de fitxers.

Et familiaritzaràs amb operacions molt comunes en el món del desenvolupament: navegar per directoris, filtrar i ordenar contingut, guardar dades a fitxers, i serialitzar objectes.

Aquest conjunt d’exercicis et permetrà posar en pràctica:

    L’ús de la classe File per accedir i gestionar arxius.
    El tractament d’estructures recursives, com els arbres de directoris.
    La manipulació de fluxos d’entrada/sortida (I/O).
    La persistència d’objectes mitjançant serialització.

Al final d’aquest nivell, hauràs creat un petit conjunt d’eines per a treballar amb el sistema de fitxers que podràs reutilitzar o ampliar en projectes futurs.

Important

Recorda: executa sempre els teus programes des de la línia de comandes i documenta les comandes al README del teu repositori.
Exercici 1

Crea una classe que llisti alfabèticament el contingut d'un directori rebut per paràmetre.
Exercici 2

Afegeix a la classe de l’exercici anterior, la funcionalitat de llistar un arbre de directoris amb el contingut de tots els seus nivells (recursivament) de manera que s'imprimeixin en pantalla en ordre alfabètic dins de cada nivell, indicant a més si és un directori (D) o un fitxer (F), i la seva última data de modificació.
Exercici 3

Modifica l’exercici anterior. Ara, en lloc de mostrar el resultat per la pantalla, guarda el resultat en un fitxer TXT.
Exercici 4

Afegeix la funcionalitat de llegir qualsevol fitxer TXT i mostra el seu contingut per consola.
Exercici 5

Ara el programa ha de serialitzar un Objecte Java a un fitxer .ser i després l’ha de desserialitzar.
Nivell 2

En aquest nivell aprendràs a parametritzar el comportament de les teves aplicacions, un pas fonamental per fer-les més flexibles, reutilitzables i adaptables a diferents entorns.

Et centraràs a extreure la configuració del codi i traslladar-la a un fitxer extern, com ara un fitxer .properties, molt utilitzat en projectes Java. També tindràs l’opció d’explorar llibreries més avançades com Apache Commons Configuration.

A partir d’un exercici ja resolt del nivell anterior, modificaràs el teu programa per llegir la configuració següent des d’un fitxer:

    Quin directori cal llegir.
    Quin ha de ser el nom i ubicació del fitxer TXT resultant.

Aquesta pràctica t’ajudarà a entendre millor com separar la configuració de la lògica del programa, una habilitat clau en entorns professionals i en el desenvolupament d’aplicacions escalables.
Exercici 1

Executa l'exercici 3 del nivell anterior parametritzant tots els mètodes en un fitxer de configuració.

Pots utilitzar un fitxer Java Properties, o bé la llibreria Apache Commons Configuration si ho prefereixes.

De l'exercici anterior, parametritza el següent:

    Directori a llegir.
    Nom i directori del fitxer TXT resultant.

Nivell 3

En aquest últim nivell t’endinsaràs en un concepte clau per a la seguretat informàtica: l'encriptació de dades.

Et tocarà crear una utilitat que permeti encriptar i desencriptar fitxers, aplicant un dels algorismes més utilitzats en el món real: AES (Advanced Encryption Standard), en modes ECB o CBC, amb l'ompliment PKCS5Padding.

Podràs utilitzar les biblioteques estàndard de Java (javax.crypto) o explorar alternatives més potents com org.apache.commons.crypto.

L’objectiu és entendre com protegir la informació sensible mitjançant criptografia simètrica, i aplicar-ho a casos reals com els fitxers generats en exercicis anteriors. Aquest exercici et prepara per a entorns professionals on la seguretat i la privadesa són essencials.
Exercici 1

Crea una utilitat que encripti i desencripti els fitxers resultants dels nivells anteriors.

Fes servir l'algorisme AES en manera de treball ECB o CBC amb mètode d'ompliment PKCS5Padding. Es pot emprar javax.crypto o bé org.apache.commons.crypto.


```

## ✨ Funcionalitats (si és aplicable)
La tasca anava encadenant els exercicis dins el mateix contexte, aixì que he decidit fer-ho
tot dins el mateix package. 

El Record CryptoSpecs ajuda a separar els _concerns_ dels distintes mètodes en Directory;
a la mida que anava canvïant els mètodes d'acord amb els exercicis, he notat la necessitat
de separar-los, tot i en Helpers també.

## 🛠 Tecnologies
- Backend: Java

## 🚀 Instal·lació i Execució
1. Clonar el repositori: `git clone javaITAc26_S01T05`
2. Execució dels tests des del terminal: 
   2.1. ` javac -d out src/s105_n1_e01_e05_directori/*.java`
   2.2. `  java -cp out s105_n1_e01_e05_directori.Main`


## 📸 Demo
```bash
Directory tree saved in memory. Make sure you either save it into a file or serialize it.
Success! Directory tree saved to: output.txt
Success! Object successfully serialized to: output.ser
Success! Object successfully deserialized from: output.ser
Arbre de directoris per a: /home/alan/alan_projects/JavaBootcamp/javaITAc26_S01T05/.
============================================================
[D] .git                           | Modificat: 2026-11-02 00:57:23

    [D] branches                       | Modificat: 2026-10-29 23:26:48

    [F] COMMIT_EDITMSG                 | Modificat: 2026-11-01 04:11:57

    [F] config                         | Modificat: 2026-10-29 23:26:49

    [F] description                    | Modificat: 2026-10-29 23:26:48

    [F] HEAD                           | Modificat: 2026-11-01 04:13:15

    [D] hooks                          | Modificat: 2026-10-29 23:26:48

        [F] applypatch-msg.sample          | Modificat: 2026-10-29 23:26:48

        [F] commit-msg.sample              | Modificat: 2026-10-29 23:26:48

        [F] fsmonitor-watchman.sample      | Modificat: 2026-10-29 23:26:48

        [F] post-update.sample             | Modificat: 2026-10-29 23:26:48

        [F] pre-applypatch.sample          | Modificat: 2026-10-29 23:26:48

        [F] pre-commit.sample              | Modificat: 2026-10-29 23:26:48

        [F] pre-merge-commit.sample        | Modificat: 2026-10-29 23:26:48

        [F] pre-push.sample                | Modificat: 2026-10-29 23:26:48

        [F] pre-rebase.sample              | Modificat: 2026-10-29 23:26:48

        [F] pre-receive.sample             | Modificat: 2026-10-29 23:26:48

        [F] prepare-commit-msg.sample      | Modificat: 2026-10-29 23:26:48

        [F] push-to-checkout.sample        | Modificat: 2026-10-29 23:26:48

        [F] sendemail-validate.sample      | Modificat: 2026-10-29 23:26:48

        [F] update.sample                  | Modificat: 2026-10-29 23:26:48

    [F] index                          | Modificat: 2026-11-02 00:57:23

    [D] info                           | Modificat: 2026-10-29 23:26:48

        [F] exclude                        | Modificat: 2026-10-29 23:26:48

    [F] kilo                           | Modificat: 2026-10-29 23:27:01

    [D] logs                           | Modificat: 2026-10-29 23:26:49

        [F] HEAD                           | Modificat: 2026-11-01 04:13:15

        [D] refs                           | Modificat: 2026-10-29 23:26:49

            [D] heads                          | Modificat: 2026-11-01 04:13:15

                [F] main                           | Modificat: 2026-11-01 04:11:57

                [F] S01T05_exercicis               | Modificat: 2026-11-01 04:13:15

            [D] remotes                        | Modificat: 2026-10-29 23:26:49

                [D] origin                         | Modificat: 2026-11-01 04:13:48

                    [F] HEAD                           | Modificat: 2026-10-29 23:26:49

                    [F] S01T05_exercicis               | Modificat: 2026-11-01 04:13:48

    [D] objects                        | Modificat: 2026-11-01 04:11:57

        [D] 00                             | Modificat: 2026-10-31 16:25:43

            [F] be2746768594a41b02454ecfb05a73a2562b87 | Modificat: 2026-10-31 16:25:43

        [D] 03                             | Modificat: 2026-10-31 12:54:02

            [F] 8bc7fdc3dcf4b71f0f89d7e4f88e21ba7bdbe0 | Modificat: 2026-10-31 12:54:02

        [D] 0a                             | Modificat: 2026-11-01 03:00:57

            [F] ad5e3d5c78c9edc0b7d513a79c4f0016f7f21c | Modificat: 2026-11-01 03:00:57

        [D] 0e                             | Modificat: 2026-11-01 04:09:43

            [F] 3a2ae6bf40949c692a6492f0c57dbd859d4b70 | Modificat: 2026-11-01 03:31:59

            [F] 809bb73c90768c728c4a6f209f1f169fda3b71 | Modificat: 2026-11-01 04:09:43

            [F] f3699f19425624ca880ea1a3ece73083f2cdf7 | Modificat: 2026-10-29 23:27:22

        [D] 10                             | Modificat: 2026-11-01 04:10:11

            [F] 0b314f623f47b52edbaf0746b19435633c0179 | Modificat: 2026-11-01 04:10:11

            [F] b3853009f5e0f742d961e1c9ad805b6879aa67 | Modificat: 2026-11-01 03:01:42

        [D] 16                             | Modificat: 2026-10-31 01:39:50

            [F] 744780a7ea5448723ace14ab534f2ef700150b | Modificat: 2026-10-31 01:39:50

        [D] 1c                             | Modificat: 2026-11-01 03:56:13

            [F] 5facf9372ee907fb17e1f01d3906677915cfdd | Modificat: 2026-11-01 03:56:13

        [D] 1e                             | Modificat: 2026-11-01 03:01:42

            [F] 4a765667cc2b0cc8f8cd8cadeeb1ebaef4eae7 | Modificat: 2026-11-01 03:01:42

        [D] 20                             | Modificat: 2026-10-31 14:50:52

            [F] 2a4e8106db3e57d68abd2657a5af69b5c13e84 | Modificat: 2026-10-31 14:50:52

        [D] 21                             | Modificat: 2026-11-01 04:10:11

            [F] 7ddabb265d99c4ca51a94c0e04c868b3690088 | Modificat: 2026-11-01 04:10:11

        [D] 27                             | Modificat: 2026-10-31 16:26:07

            [F] 2fd2210246d38a4ee240ddbcea18b955f7ce4a | Modificat: 2026-10-31 16:26:07

        [D] 28                             | Modificat: 2026-11-01 03:18:27

            [F] 37adf5443771c8cb9ba6ff929cbf7456c4db65 | Modificat: 2026-11-01 03:18:27

        [D] 2a                             | Modificat: 2026-10-31 01:39:50

            [F] e884d5ccd9c83bdf70176c53ba2a91d7aa4f21 | Modificat: 2026-10-31 01:39:50

        [D] 2c                             | Modificat: 2026-11-01 03:26:44

            [F] 2c8455fb13574aba819e2dadf2e651efe3aa06 | Modificat: 2026-11-01 03:26:44

        [D] 30                             | Modificat: 2026-10-29 23:27:22

            [F] cf57ed7cba5157ad5f7c05ede08adde945ada6 | Modificat: 2026-10-31 14:51:40

        [D] 31                             | Modificat: 2026-10-31 14:51:40

            [F] ff8b42ceec6b1f129678498f5d2cc34dc6510c | Modificat: 2026-10-31 14:51:40

        [D] 35                             | Modificat: 2026-10-29 23:27:22

            [F] eb1ddfbbc029bcab630581847471d7f238ec53 | Modificat: 2026-10-29 23:27:22

        [D] 36                             | Modificat: 2026-10-31 14:50:28

            [F] c8ab050fce49bb7b148edb657db0fc733c75e5 | Modificat: 2026-10-31 14:50:28

        [D] 40                             | Modificat: 2026-11-01 03:01:29

            [F] 3998fa85d9d8b53379f870b2c7e6d9dd24bc51 | Modificat: 2026-10-31 14:50:52

            [F] 6baf38f3a1c3a2609d3f42b9b28b7c2fa70b32 | Modificat: 2026-11-01 03:01:29

            [F] 892182bce99f54b9765bcf54fb7f714d5d1559 | Modificat: 2026-10-31 16:27:00

        [D] 42                             | Modificat: 2026-11-01 04:10:11

            [F] 4ac42819b49f1b19a6bb7b4bbe255c98860d25 | Modificat: 2026-11-01 04:10:11

        [D] 46                             | Modificat: 2026-10-31 14:51:40

            [F] 57dd1b2339640cf53c8799d595b9af8c5753ab | Modificat: 2026-10-31 14:51:40

        [D] 4a                             | Modificat: 2026-10-31 16:27:00

            [F] 2911c84620c2a67c85e02cd3fcc51ea7a0035e | Modificat: 2026-10-31 16:27:00

            [F] 6151e5d9b0e0eaabb9309f1e70a2622fe60e62 | Modificat: 2026-10-31 01:39:50

        [D] 4d                             | Modificat: 2026-10-31 01:39:50

            [F] cac803e4ecfb272f64ad50d5154a001b78125f | Modificat: 2026-10-31 01:39:50

        [D] 4e                             | Modificat: 2026-10-31 16:25:43

            [F] e6d5455da4988b8baa39cd2edde51ef94a28a0 | Modificat: 2026-10-31 16:25:43

        [D] 55                             | Modificat: 2026-11-01 04:11:57

            [F] 7cfd5a0a8b8b1fa11888d38ea8c16066279399 | Modificat: 2026-11-01 04:11:57

            [F] c81efca32e3ffdb7fab8aafa0a589555600f55 | Modificat: 2026-10-31 01:39:50

        [D] 57                             | Modificat: 2026-11-01 04:09:43

            [F] e7deca68c97b76f0100217510ea417f127eae6 | Modificat: 2026-11-01 04:09:43

        [D] 5a                             | Modificat: 2026-10-31 14:51:01

            [F] c7f92e4af0823bbfbd727be1739aaf63780280 | Modificat: 2026-10-31 14:51:01

        [D] 5f                             | Modificat: 2026-11-01 03:26:44

            [F] 60a4550a89dbde8e3bec37fcf5ac37974b2663 | Modificat: 2026-11-01 03:26:44

        [D] 60                             | Modificat: 2026-11-01 03:12:54

            [F] f0b3c2ff31dfbbbb12acbb74fb9ab39c156f55 | Modificat: 2026-11-01 03:12:54

        [D] 66                             | Modificat: 2026-11-01 03:12:54

            [F] 9121500332d949367dcb1eb30ef31029bcfb67 | Modificat: 2026-11-01 03:12:54

            [F] e08e943003100c22936e0f3754743038b92915 | Modificat: 2026-11-01 03:12:41

        [D] 68                             | Modificat: 2026-11-01 03:01:29

            [F] 7a5801800b546e05cc271bf2413a65718609ee | Modificat: 2026-11-01 03:01:29

        [D] 70                             | Modificat: 2026-11-01 03:56:13

            [F] e5696feb2bf5376e6aacae6abe1e4713371067 | Modificat: 2026-11-01 03:56:13

        [D] 75                             | Modificat: 2026-11-01 03:12:41

            [F] 6972f2a7cd55d6d540d8b1218a320bad81861d | Modificat: 2026-11-01 03:12:41

        [D] 77                             | Modificat: 2026-10-31 16:27:00

            [F] dc749e75823cb89855666452d1c2c3759f8e7d | Modificat: 2026-10-31 16:27:00

        [D] 79                             | Modificat: 2026-11-01 03:01:29

            [F] 8ea8aacb7ff7833017d5fccc8458023b747887 | Modificat: 2026-11-01 03:01:29

        [D] 82                             | Modificat: 2026-11-01 04:10:11

            [F] 922446cedb1bd87339b3b5cce8189e9313ff96 | Modificat: 2026-11-01 04:10:11

        [D] 86                             | Modificat: 2026-10-29 23:27:22

            [F] 4c53030ac69caf4f4495f22fd59c3afdee7850 | Modificat: 2026-10-29 23:27:22

        [D] 89                             | Modificat: 2026-10-31 14:51:01

            [F] bac53e6604d34f9a907168d843ef43374d37cc | Modificat: 2026-10-31 14:51:01

        [D] 8e                             | Modificat: 2026-11-01 02:51:03

            [F] f6e43a05dede854d595c4eeecd2aa927a6ef96 | Modificat: 2026-11-01 02:51:03

        [D] 8f                             | Modificat: 2026-10-31 16:26:07

            [F] 8e18d57e4cb2ed098df8f0131b2b18b039f248 | Modificat: 2026-10-31 16:26:07

        [D] 92                             | Modificat: 2026-11-01 04:11:57

            [F] 19a1d7a2c8b7ef5bb3df60b9c437f29fff6cc4 | Modificat: 2026-10-31 16:26:07

            [F] 5f79dcd173966bd8f638304caec89737618c14 | Modificat: 2026-11-01 04:11:57

        [D] 93                             | Modificat: 2026-11-01 03:26:44

            [F] 7b07ace1a4163d8b924476a1a01c6ffc921555 | Modificat: 2026-11-01 03:26:44

        [D] 94                             | Modificat: 2026-11-01 03:12:41

            [F] 147019e7cb53f2c8acab032e8625b2b984d903 | Modificat: 2026-11-01 03:12:41

        [D] 99                             | Modificat: 2026-10-31 16:25:43

            [F] cb1d32cf834d0404d9fecf6570ca1d784b13ee | Modificat: 2026-10-31 16:25:43

        [D] 9a                             | Modificat: 2026-11-01 03:00:57

            [F] fd6f3701c29233b1ad7bef56f6e78984044b38 | Modificat: 2026-11-01 03:00:57

        [D] a4                             | Modificat: 2026-11-01 03:12:41

            [F] a57288c22450279eabccba206cc0c342851202 | Modificat: 2026-10-31 16:26:07

            [F] eb45426049bccd122282131237fc2b4dcf108a | Modificat: 2026-11-01 03:12:41

        [D] a5                             | Modificat: 2026-11-01 03:01:42

            [F] 5baaa073f875257aa7c6614e2d23d96a4d91d7 | Modificat: 2026-11-01 03:01:42

        [D] a6                             | Modificat: 2026-11-01 03:00:57

            [F] 4246ca34ee1f18f72b34697052893b620a5a06 | Modificat: 2026-11-01 03:00:57

            [F] 9822c8582f9b1ae77670c8c7dac89898b0246f | Modificat: 2026-10-31 14:50:52

        [D] aa                             | Modificat: 2026-10-31 14:51:40

            [F] 97746ca3501817f056a4b3b4bc61821a190475 | Modificat: 2026-11-01 04:11:57

        [D] ad                             | Modificat: 2026-11-01 03:01:42

            [F] cb5dbd6318505eea04bdcad31141fe0d9ef87b | Modificat: 2026-11-01 03:01:42

        [D] ae                             | Modificat: 2026-10-31 16:25:43

            [F] a903de3a78cec318b62eacd329b0f80c55df1e | Modificat: 2026-10-31 16:25:43

        [D] b0                             | Modificat: 2026-11-01 03:00:57

            [F] 2e19e156acf2f3f1587c74eb527a346b21a2ce | Modificat: 2026-11-01 03:00:57

        [D] b5                             | Modificat: 2026-10-31 16:27:00

            [F] 676e3705584be5d074a691520a15f81604f356 | Modificat: 2026-10-31 16:27:00

        [D] ba                             | Modificat: 2026-11-01 03:01:42

            [F] c514d6d91e3cae085b0936f5b13967834bb500 | Modificat: 2026-11-01 03:01:42

        [D] bb                             | Modificat: 2026-10-31 14:50:28

            [F] f12e11d1ddfc7bc322dfe87dad83e550aa50e3 | Modificat: 2026-10-31 14:50:28

        [D] bd                             | Modificat: 2026-11-01 04:10:11

            [F] 581b9cacc35311f6154db9ecec8816225f4a41 | Modificat: 2026-11-01 04:10:11

            [F] 8ad5c65b4c4a3c46cd9f249f1439993b3f1375 | Modificat: 2026-11-01 04:09:43

            [F] a6b0465340a3f4eff9487a53f982e30dbcecb0 | Modificat: 2026-10-31 16:29:17

        [D] c0                             | Modificat: 2026-11-01 03:56:13

            [F] 33e5405d8a55e51ac157c3c37da4cbe374deec | Modificat: 2026-11-01 03:56:13

        [D] c1                             | Modificat: 2026-11-01 04:09:43

            [F] 07c19dece3eaf5bbae848452bcfdef7271e5b5 | Modificat: 2026-11-01 04:09:43

            [F] 3b950a28f264dcb7e3cbfc75712f95371c4543 | Modificat: 2026-10-31 14:51:01

        [D] c6                             | Modificat: 2026-10-31 14:50:28

            [F] d9ce56a4d4741008302d5a4a1218f19cb83c16 | Modificat: 2026-10-31 14:50:28

        [D] c8                             | Modificat: 2026-11-01 04:11:57

            [F] 19358d6e067ba250d77203738a666101d7928e | Modificat: 2026-10-31 14:50:28

            [F] e46843290651b8592830cd7cb6cb0c7fe5c44b | Modificat: 2026-11-01 04:11:57

        [D] d0                             | Modificat: 2026-10-31 14:50:28

            [F] d842239ee409f62dc58b392aa8c6951db66770 | Modificat: 2026-10-31 14:50:28

        [D] d1                             | Modificat: 2026-10-31 14:51:01

            [F] 84cdc64f1d722af86c52515c08696e66a828e8 | Modificat: 2026-10-31 14:51:01

        [D] d2                             | Modificat: 2026-10-31 16:26:07

            [F] 5fda38901a4f90529c9858ee036256c8f8d0d5 | Modificat: 2026-10-31 16:26:07

        [D] d6                             | Modificat: 2026-11-01 04:10:11

            [F] a2ada3246eb43b40228a713af93748a387f9dc | Modificat: 2026-11-01 03:00:57

            [F] cb412c350fbbb2c1b76337ce05041a7f20ac4f | Modificat: 2026-11-01 04:10:11

        [D] d7                             | Modificat: 2026-10-31 16:25:43

            [F] 0914296f9041dad86e919260a60a4e48040110 | Modificat: 2026-10-31 16:25:43

        [D] d9                             | Modificat: 2026-10-31 01:32:11

            [F] 9f4c874efa71c688cd4c1a425b23ecaf159ac2 | Modificat: 2026-10-31 01:32:11

        [D] db                             | Modificat: 2026-11-01 04:11:57

            [F] b2d19608268dfc144788682d726cd13d053b00 | Modificat: 2026-11-01 04:11:57

        [D] dc                             | Modificat: 2026-11-01 03:12:41

            [F] 099b3428b5037ed0c475b05e79ed0537244377 | Modificat: 2026-11-01 03:26:44

        [D] dd                             | Modificat: 2026-11-01 03:12:54

            [F] 76e5989fd18c5bf88fef082a4eceb5023c599e | Modificat: 2026-11-01 03:12:54

        [D] df                             | Modificat: 2026-10-31 14:51:01

            [F] ed42de67a85721747ba36d5637ee03fc6812d0 | Modificat: 2026-10-31 14:51:01

        [D] e0                             | Modificat: 2026-11-01 03:01:29

            [F] d6ab7d1150b6fc7c150711e606d7fcfbd409a6 | Modificat: 2026-11-01 03:01:29

        [D] e3                             | Modificat: 2026-11-01 03:12:54

            [F] ac304eb19d43ed2e39b7e8b6f3cc606e9b2849 | Modificat: 2026-11-01 03:12:54

        [D] e4                             | Modificat: 2026-11-01 03:26:44

            [F] bf72a6e66a606a6b1fe0cb3e73e235b77e3e97 | Modificat: 2026-11-01 04:09:43

        [D] e6                             | Modificat: 2026-11-01 03:07:02

            [F] 9de29bb2d1d6434b8b29ae775ad8c2e48c5391 | Modificat: 2026-11-02 00:57:23

        [D] ea                             | Modificat: 2026-11-01 03:12:54

            [F] 8e93ef66955d7a73b7dff73fab914bf8247ba1 | Modificat: 2026-11-01 03:12:54

        [D] eb                             | Modificat: 2026-11-01 03:20:52

            [F] e894e3b21e741680684dfc78ea47125783a995 | Modificat: 2026-11-01 03:20:52

        [D] ec                             | Modificat: 2026-11-01 04:11:57

            [F] 0d1cd90b2b630b7bca8654c951da33dcace78f | Modificat: 2026-11-01 04:11:57

            [F] 3e25530a4a5f5994630fd906ec8ef85dca2bab | Modificat: 2026-11-01 03:21:42

        [D] ed                             | Modificat: 2026-10-31 12:51:21

            [F] 876d0cdb83c71b9bcf3ba979b97608ce58c3c0 | Modificat: 2026-10-31 01:29:35

            [F] de5d6824695b46ca4cbfa50f99dad737277abb | Modificat: 2026-10-31 12:51:21

        [D] ef                             | Modificat: 2026-10-31 16:27:00

            [F] 2989a703f4a278f31b7b00a96db081b5d54445 | Modificat: 2026-10-31 16:27:00

        [D] f5                             | Modificat: 2026-11-01 03:01:29

            [F] 80a9eeb024066cf4dafbf3ce172b6a03b60672 | Modificat: 2026-11-01 03:01:29

        [D] f9                             | Modificat: 2026-10-31 14:50:52

            [F] 4815c63d05c5ff05c986c721087920b94614c7 | Modificat: 2026-10-31 14:50:52

        [D] fb                             | Modificat: 2026-10-31 14:50:52

            [F] fe4ea6d4fca00e0964c7f1e00338c24722f6e8 | Modificat: 2026-10-31 14:50:52

        [D] info                           | Modificat: 2026-10-29 23:26:48

        [D] pack                           | Modificat: 2026-10-29 23:26:49

            [F] pack-2523d4f16b1e4cbe25653412bb3eb4967289cbe2.idx | Modificat: 2026-10-29 23:26:49

            [F] pack-2523d4f16b1e4cbe25653412bb3eb4967289cbe2.pack | Modificat: 2026-10-29 23:26:49

            [F] pack-2523d4f16b1e4cbe25653412bb3eb4967289cbe2.rev | Modificat: 2026-10-29 23:26:49

    [F] packed-refs                    | Modificat: 2026-10-29 23:26:49

    [D] refs                           | Modificat: 2026-10-29 23:26:49

        [D] heads                          | Modificat: 2026-11-01 04:13:15

            [F] main                           | Modificat: 2026-11-01 04:11:57

            [F] S01T05_exercicis               | Modificat: 2026-11-01 04:13:15

        [D] remotes                        | Modificat: 2026-10-29 23:26:49

            [D] origin                         | Modificat: 2026-11-01 16:56:49

                [F] HEAD                           | Modificat: 2026-10-29 23:26:49

                [F] S01T05_exercicis               | Modificat: 2026-11-01 04:13:48

        [D] tags                           | Modificat: 2026-10-29 23:26:48

[D] .idea                          | Modificat: 2026-10-29 23:27:10

    [F] .gitignore                     | Modificat: 2026-10-29 23:27:02

    [F] javaITAc26_S01T05.iml          | Modificat: 2026-10-29 23:27:10

    [F] misc.xml                       | Modificat: 2026-10-29 23:27:10

    [F] modules.xml                    | Modificat: 2026-10-29 23:27:10

    [F] vcs.xml                        | Modificat: 2026-10-29 23:27:10

    [F] workspace.xml                  | Modificat: 2026-10-29 23:27:10

[F] config.properties              | Modificat: 2026-11-01 03:58:41

[D] out                            | Modificat: 2026-10-31 15:38:52

    [D] s105_n1_e01_e05_directori      | Modificat: 2026-11-01 03:49:21

        [F] CryptoSpecs.class              | Modificat: 2026-11-02 01:04:22

        [F] Directory.class                | Modificat: 2026-11-02 01:04:22

        [F] DirectorySer.class             | Modificat: 2026-11-02 01:04:22

        [F] Encryptor.class                | Modificat: 2026-11-02 01:04:22

        [F] Helpers.class                  | Modificat: 2026-11-02 01:04:22

        [F] Main.class                     | Modificat: 2026-11-02 01:04:22

[F] output.ser                     | Modificat: 2026-11-01 04:11:33

[F] output.txt                     | Modificat: 2026-11-01 04:11:33

[F] output_decrypted.txt           | Modificat: 2026-11-01 04:11:33

[F] output_encrypted.enc           | Modificat: 2026-11-01 04:11:33

[F] README.md                      | Modificat: 2026-10-29 23:26:49

[D] src                            | Modificat: 2026-10-31 01:27:16

    [D] s105_n1_e01_e05_directori      | Modificat: 2026-11-02 01:04:20

        [F] CryptoSpecs.java               | Modificat: 2026-11-01 04:09:21

        [F] Directory.java                 | Modificat: 2026-11-01 02:53:01

        [F] DirectorySer.java              | Modificat: 2026-11-01 02:53:01

        [F] Encryptor.java                 | Modificat: 2026-11-01 04:05:52

        [F] Helpers.java                   | Modificat: 2026-10-31 12:55:05

        [F] Main.java                      | Modificat: 2026-11-01 04:11:27

        [F] README.md                      | Modificat: 2026-11-02 01:04:20


File successfully encrypted to: output_encrypted.enc
File successfully decrypted back to: output_decrypted.txt
```