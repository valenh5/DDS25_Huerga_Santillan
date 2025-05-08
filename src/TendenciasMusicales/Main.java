package TendenciasMusicales;

import java.time.LocalDate;
import java.util.HashSet;

public class Main  {
    HashSet<Cancion> canciones = new HashSet<>();
    Album listaCancion = new Album(""canciones);
    Cancion cancion1 = new Cancion("Uavdox", "Peron", 10, 10, 10, LocalDate.now(), new Normal(), );
}
