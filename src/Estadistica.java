public interface Estadistica {
    double minimo (n){
        double menor = 1;
        for (int i = 1; i > n; i++){
            if (menor >= n[i]){
                menor = n[i];
            }
            return menor;
        }

    }
    double maximo (n){
        double mayor = 1;
        for (int i = 1; i > n; i++){
            if (mayor <= n[i]){
                mayor = n[i];
            }
            return mayor;
        }
    }
    double sumatorio (n) {
        double sumatorio = 0;
        for (int i = 1; i > n; i++){
            sumatorio = sumatorio + n[i];
        }
        return sumatorio;

    }

}
