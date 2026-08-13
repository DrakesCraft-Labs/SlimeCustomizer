package cl.jackstar.slimecustomizer;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.bukkit.entity.EntityType;
import org.jetbrains.annotations.NotNull;

/**
 * Nombres de criatura en español.
 *
 * Sustituye a {@code net.guizhanss.guizhanlib.minecraft.helper.entity.EntityTypeHelper}, que hacia
 * lo mismo en chino y obligaba a arrastrar GuizhanLib entera -- con su autoactualizador -- por una
 * sola llamada, la del lore de los drops de mobs.
 *
 * Se busca por la clave del registro: en 1.21 EntityType dejo de ser un enum estable y la clave es
 * lo unico que no cambia entre versiones.
 */
public final class NombresCriatura {

    private static final Map<String, String> NOMBRES = new HashMap<>();

    static {
        // Hostiles
        NOMBRES.put("zombie", "Zombi");
        NOMBRES.put("zombie_villager", "Aldeano Zombi");
        NOMBRES.put("husk", "Zombi Momia");
        NOMBRES.put("drowned", "Ahogado");
        NOMBRES.put("skeleton", "Esqueleto");
        NOMBRES.put("stray", "Vagabundo");
        NOMBRES.put("wither_skeleton", "Esqueleto Wither");
        NOMBRES.put("bogged", "Encenagado");
        NOMBRES.put("creeper", "Creeper");
        NOMBRES.put("spider", "Araña");
        NOMBRES.put("cave_spider", "Araña de Cueva");
        NOMBRES.put("enderman", "Enderman");
        NOMBRES.put("endermite", "Endermita");
        NOMBRES.put("silverfish", "Lepisma");
        NOMBRES.put("witch", "Bruja");
        NOMBRES.put("slime", "Slime");
        NOMBRES.put("magma_cube", "Cubo de Magma");
        NOMBRES.put("blaze", "Blaze");
        NOMBRES.put("ghast", "Ghast");
        NOMBRES.put("phantom", "Fantasma");
        NOMBRES.put("piglin", "Piglin");
        NOMBRES.put("piglin_brute", "Piglin Bruto");
        NOMBRES.put("zombified_piglin", "Piglin Zombificado");
        NOMBRES.put("hoglin", "Hoglin");
        NOMBRES.put("zoglin", "Zoglin");
        NOMBRES.put("guardian", "Guardián");
        NOMBRES.put("elder_guardian", "Guardián Anciano");
        NOMBRES.put("shulker", "Shulker");
        NOMBRES.put("vindicator", "Vindicador");
        NOMBRES.put("evoker", "Evocador");
        NOMBRES.put("pillager", "Saqueador");
        NOMBRES.put("ravager", "Devastador");
        NOMBRES.put("vex", "Vex");
        NOMBRES.put("illusioner", "Ilusionista");
        NOMBRES.put("warden", "Warden");
        NOMBRES.put("breeze", "Brisa");
        NOMBRES.put("creaking", "Crujiente");
        // Jefes
        NOMBRES.put("ender_dragon", "Dragón del End");
        NOMBRES.put("wither", "Wither");
        // Pasivas
        NOMBRES.put("cow", "Vaca");
        NOMBRES.put("pig", "Cerdo");
        NOMBRES.put("sheep", "Oveja");
        NOMBRES.put("chicken", "Gallina");
        NOMBRES.put("rabbit", "Conejo");
        NOMBRES.put("horse", "Caballo");
        NOMBRES.put("donkey", "Burro");
        NOMBRES.put("mule", "Mula");
        NOMBRES.put("llama", "Llama");
        NOMBRES.put("mooshroom", "Champivaca");
        NOMBRES.put("villager", "Aldeano");
        NOMBRES.put("wandering_trader", "Comerciante Errante");
        NOMBRES.put("iron_golem", "Gólem de Hierro");
        NOMBRES.put("snow_golem", "Gólem de Nieve");
        NOMBRES.put("bat", "Murciélago");
        NOMBRES.put("squid", "Calamar");
        NOMBRES.put("glow_squid", "Calamar Luminoso");
        NOMBRES.put("dolphin", "Delfín");
        NOMBRES.put("turtle", "Tortuga");
        NOMBRES.put("cod", "Bacalao");
        NOMBRES.put("salmon", "Salmón");
        NOMBRES.put("pufferfish", "Pez Globo");
        NOMBRES.put("tropical_fish", "Pez Tropical");
        NOMBRES.put("axolotl", "Ajolote");
        NOMBRES.put("frog", "Rana");
        NOMBRES.put("tadpole", "Renacuajo");
        NOMBRES.put("wolf", "Lobo");
        NOMBRES.put("cat", "Gato");
        NOMBRES.put("ocelot", "Ocelote");
        NOMBRES.put("fox", "Zorro");
        NOMBRES.put("panda", "Panda");
        NOMBRES.put("bee", "Abeja");
        NOMBRES.put("polar_bear", "Oso Polar");
        NOMBRES.put("goat", "Cabra");
        NOMBRES.put("camel", "Camello");
        NOMBRES.put("sniffer", "Rastreador");
        NOMBRES.put("armadillo", "Armadillo");
        NOMBRES.put("allay", "Allay");
        NOMBRES.put("parrot", "Loro");
        NOMBRES.put("strider", "Lavagante");
        NOMBRES.put("skeleton_horse", "Caballo Esqueleto");
        NOMBRES.put("zombie_horse", "Caballo Zombi");
        NOMBRES.put("trader_llama", "Llama de Comerciante");
    }

    private NombresCriatura() {}

    /**
     * El nombre en español, o la clave legible si no se conoce.
     *
     * Devolver la clave y no una cadena vacia es a proposito: si Mojang añade una criatura, el
     * jugador ve algo identificable y a nosotros nos salta a la vista que falta traducir.
     */
    @NotNull
    public static String getName(@NotNull EntityType tipo) {
        String clave = tipo.getKey().getKey().toLowerCase(Locale.ROOT);
        String nombre = NOMBRES.get(clave);
        return nombre != null ? nombre : clave.replace('_', ' ');
    }
}
