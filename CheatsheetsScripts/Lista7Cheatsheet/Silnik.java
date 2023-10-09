public interface Silnik {
    public void uruchom();
    public void wyłącz();
    public void tankuj(int ilosc);
}

/*
Interfejs - zestaw metod bez ich implementacji.
Właściwa implementacja metod danego interfejsu znajduje się w klasie implementującej dany interfejs.

[specyfikator_dostępu] interface nazwa_interfejsu {
 	elementy_interfejsu...
 }
 */