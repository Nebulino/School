# Verifica 22.10.2019

### A
Punto
- -x double
- -y double
- +Punto(in x: double, in y: double)
- +distanza(in punto: Punto): double
- +equals(in punto: Punto): double

Cerchio
- -centro Punto
- -raggio double
- +Cerchio(in centro: Punto, in raggio: double)
- +circonferenza(): double
- +area(): double
- +contenuto(in cerchio: Cerchio): boolean
- +concentrici(in cerchio: Cerchio): boolean

Il metodo `contenuto` verifica se il centro di c1 è contenuto dentro c2.<br>
Il metodo `concentrici` verifica se i due cerchi hanno lo stesso centro.

### B
Scrivere un metodo `eliminaSpazi` che elimina gli eventuali spazi in testa presenti in una stringa presa in input.
