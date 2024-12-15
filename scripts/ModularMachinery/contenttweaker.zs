#loader contenttweaker

import mods.contenttweaker.VanillaFactory;
import mods.contenttweaker.Item;

var ModulariumCatalyst = VanillaFactory.createItem("modulariumcatalyst");
ModulariumCatalyst.beaconPayment = false;
ModulariumCatalyst.register();
