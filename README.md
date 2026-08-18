<p align="center">
  <img src="https://raw.githubusercontent.com/DrakesCraft-Labs/SlimeCustomizer/main/banner.svg" alt="SlimeCustomizer for DrakesCraft" width="100%">
</p>

# SlimeCustomizer for DrakesCraft

Maintained compatibility port of SlimeCustomizer for the DrakesCraft Slimefun ecosystem on Paper/Purpur 1.21.11.

SlimeCustomizer lets server administrators define Slimefun items, recipes and machines through configuration instead of compiling a new addon for every content adjustment. This repository keeps that workflow compatible with the DrakesCraft Slimefun core and its legacy package bridge.

## Player guide

Players should use the public [DrakesCraft Slimefun guide](https://web.drakescraft.cl/guia-slimefun.html#slimecustomizer). It documents the content enabled on the live server rather than every feature supported by the engine.

## Development

```bash
mvn -DskipTests package
```

Requirements:

- Java 21
- Paper/Purpur 1.21.11
- DrakesCraft Slimefun core
- Maven 3.9+

The distributable JAR is generated under `target/`.

## Maintenance policy

- Runtime update checks and telemetry are disabled in production builds.
- Public documentation links point to the canonical DrakesCraft guide.
- Compatibility changes stay scoped to the Drake core and Minecraft 1.21.11.
- Secrets, live server configuration and player data never belong in this repository.

## Credits and license

This is an independent DrakesCraft-Labs maintenance repository based on the original SlimefunGuguProject work. Original authorship remains credited in source and metadata. Distributed under the license in [LICENSE.txt](LICENSE.txt).
