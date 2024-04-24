package dev.hideko.keeppotion.listener

import dev.hideko.keeppotion.KeepPotion
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.PlayerDeathEvent
import org.bukkit.event.player.PlayerRespawnEvent
import org.bukkit.scheduler.BukkitRunnable

class EffectBreak: Listener {

    @EventHandler
    fun onPlayerDeath(e: PlayerDeathEvent) {
        addStoreEff(e.player)
    }

    @EventHandler
    fun onPlayerRespawn(e: PlayerRespawnEvent) {
        object: BukkitRunnable() {
            override fun run() {
                applyEff(e.player)
            }
        }.runTaskLater(KeepPotion.getInstance(), 2L)
    }

    private fun addStoreEff(player: Player) {
        val instance = KeepPotion.getInstance()
        instance.playerEffects.remove(player)
        instance.playerEffects[player] = player.activePotionEffects
    }

    private fun applyEff(player: Player) {
        val instance = KeepPotion.getInstance()
        val effs = instance.playerEffects[player] ?: return
        effs.forEach {
            player.removePotionEffect(it.type)
            player.addPotionEffect(it)
        }
    }

}