package me.kaloyankys.wilderworld.init;

import me.kaloyankys.wilderworld.client.PublicDefaultParticleType;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class WWParticles {

    public static final DefaultParticleType STEAM = register("steam", new PublicDefaultParticleType(true));
    public static final DefaultParticleType CHOCOLATE_DRIP = register("chocolate_drip", new PublicDefaultParticleType(true));
    public static final DefaultParticleType CHOCOLATE_FALL = register("chocolate_fall", new PublicDefaultParticleType(true));
    public static final DefaultParticleType CHOCOLATE_LAND = register("chocolate_land", new PublicDefaultParticleType(true));
    public static final DefaultParticleType SWEETBERRY_DRIP = register("sweetberry_drip", new PublicDefaultParticleType(true));
    public static final DefaultParticleType SWEETBERRY_FALL = register("sweetberry_fall", new PublicDefaultParticleType(true));
    public static final DefaultParticleType SWEETBERRY_LAND = register("sweetberry_land", new PublicDefaultParticleType(true));
    public static final DefaultParticleType MINT_DRIP = register("mint_drip", new PublicDefaultParticleType(true));
    public static final DefaultParticleType MINT_FALL = register("mint_fall", new PublicDefaultParticleType(true));
    public static final DefaultParticleType MINT_LAND = register("mint_land", new PublicDefaultParticleType(true));
    public static final DefaultParticleType SPELUNKING_GLOW = register("spelunking_glow", new PublicDefaultParticleType(true));

    private static DefaultParticleType register(String id, DefaultParticleType particle) {
        Registry.register(Registry.PARTICLE_TYPE, new Identifier("wilderworld", id), particle);
        return particle;
    }
}
