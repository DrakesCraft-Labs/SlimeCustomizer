package cl.jackstar.slimecustomizer;

import javax.annotation.Nullable;

import org.bukkit.Location;

import com.github.drakescraft_labs.slimefun4.legacy.api.BlockStorage;
import com.github.drakescraft_labs.slimefun4.legacy.api.inventory.BlockMenu;

/**
 * Puente hacia el almacenamiento clasico de Slimefun.
 *
 * POR QUE
 *
 * El addon usaba {@code com.xzavier0722.mc.plugin.slimefun4.storage.util.StorageCacheUtils}, que
 * es la capa SQL del fork chino de Slimefun. Nuestro core no la tiene: guarda con el BlockStorage
 * de toda la vida.
 *
 * Las tres llamadas que usaba tienen equivalente directo, asi que en vez de portar la capa entera
 * -- que son 68 ficheros y va por otro camino -- se traduce aqui la firma y listo.
 *
 * Si algun dia se adopta la capa SQL, este fichero es lo unico que habria que tocar.
 */
public final class Almacen {

    private Almacen() {}

    /** Guarda un dato del bloque. */
    public static void setData(Location l, String clave, String valor) {
        BlockStorage.addBlockInfo(l, clave, valor);
    }

    /** Lee un dato del bloque, o null si no esta. */
    @Nullable
    public static String getData(Location l, String clave) {
        return BlockStorage.getLocationInfo(l, clave);
    }

    /** El inventario de la maquina, o null si el bloque no tiene. */
    @Nullable
    public static BlockMenu getMenu(Location l) {
        return BlockStorage.getInventory(l);
    }
}
