// Variable Setup

def thermalSteel = 'thermalfoundation:material:160'
def thermalElectrum = 'thermalfoundation:material:161'
def thermalElectrumBlend = 'thermalfoundation:material:97'
def thermalInvar = 'thermalfoundation:material:162'
def thermalInvarBlend = 'thermalfoundation:material:98'
def thermalBronze = 'thermalfoundation:material:163'
def thermalBronzeBlend = 'thermalfoundation:material:99'
// Remove thermal alloys

// Steel
crafting.removeByOutput(item('thermalfoundation:material:160'))
crafting.removeByInput(item('thermalfoundation:material:160'))
mods.enderio.alloy_smelter.remove(item(thermalSteel))
mods.thermalexpansion.smelter.removeByOutput(item(thermalSteel))
mods.thermalexpansion.smelter.removeByInput(item(thermalSteel))

// Electrum
crafting.removeByOutput(item(thermalElectrum))
crafting.removeByInput(item(thermalElectrum))
mods.enderio.alloy_smelter.remove(item(thermalElectrum))
mods.thermalexpansion.smelter.removeByOutput(item(thermalElectrum))
mods.thermalexpansion.smelter.removeByInput(item(thermalElectrum))

// Electrum Blend
crafting.removeByOutput(item(thermalElectrumBlend))

// Invar
crafting.removeByOutput(item(thermalInvar))
crafting.removeByInput(item(thermalInvar))
mods.enderio.alloy_smelter.remove(item(thermalInvar))
mods.thermalexpansion.smelter.removeByOutput(item(thermalInvar))
mods.thermalexpansion.smelter.removeByInput(item(thermalInvar))

// Invar Blend
crafting.removeByOutput(item(thermalInvarBlend))

// Bronze
crafting.removeByOutput(item(thermalBronze))
crafting.removeByInput(item(thermalBronze))
mods.enderio.alloy_smelter.remove(item(thermalBronze))
mods.thermalexpansion.smelter.removeByOutput(item(thermalBronze))
mods.thermalexpansion.smelter.removeByInput(item(thermalBronze))

// Bronze Blend
crafting.removeByOutput(item(thermalBronzeBlend))