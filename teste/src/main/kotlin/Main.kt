/*Fizzbuzz é um jogo infantil com as regras:

Você se reveza para contar de 1 até .. infinito. Mas digamos 100.
Sempre que o número for
um múltiplo de 3, você deve dizer "Fizz" em vez do número
um múltiplo de 5, você deve dizer "Buzz" em vez do número
um múltiplo de 3 E 5, você deve dizer "Fizzbuzz" em vez do número
Seu código deve imprimir os números de 1 a 100, mas com Fizz, Buzz e Fizzbuzz nos lugares certos.*/







fun main(args: Array<String>) {
    var cont = 0
    var fizz = "fizz"
    var buzz = "buzz"
    var fizzbuzz = "fizzbuzz"


    for (i in 1..100) {
        cont++

        print("\n$cont")
        if (i % 3 == 0 && i % 5 != 0 ) {
            print(" fizz")
        } else if (i % 5 == 0 && i % 3 != 0) {
            print(" buzz")
            }else if(i % 5 == 0 && i % 3 == 0){
                print(" buzzfizz ")
        }
        }
    }















