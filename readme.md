

| Metoda | Ścieżka                     | Parametr | Opis                                                                   |
|--------|-----------------------------|----------|------------------------------------------------------------------------|
| GET    | /rev                        | {string} | Zwraca odwrócony ciąg znaków                                           |
| GET    | /checkType                  | {string} | Sprawdza jakie znaki zawiera string i zwraca zbudowaną odpowiedź       |


Przykłady wykorzystania:

| Metoda | Ścieżka                     | Parametr | Dane na wejściu | Dane wyjściowe                                                     |
|--------|-----------------------------|----------|-----------------|--------------------------------------------------------------------|
| GET    | /rev                        | {string} | abcd            | dcba                                                               |
| GET    | /checkType                  | {string} | abc1A$          | String zawiera: znak specjalny znak liczby dużą litere małą literę |
