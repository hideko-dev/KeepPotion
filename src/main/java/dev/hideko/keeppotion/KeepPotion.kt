package dev.hideko.keeppotion

import dev.hideko.keeppotion.listener.EffectBreak
import org.bukkit.Effect
import org.bukkit.entity.Player
import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.potion.PotionEffect

class KeepPotion : JavaPlugin() {

    companion object {
        private lateinit var instance: KeepPotion
        fun getInstance(): KeepPotion { return instance }
    }

    val playerEffects: MutableMap<Player, Collection<PotionEffect>> = mutableMapOf()

    override fun onEnable() {
        instance = this
        server.pluginManager.registerEvents(EffectBreak(), this)
        // Plugin startup logic
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
