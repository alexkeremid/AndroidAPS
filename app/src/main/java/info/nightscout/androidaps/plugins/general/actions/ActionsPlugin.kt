package info.nightscout.androidaps.plugins.general.actions

import info.nightscout.androidaps.R
import info.nightscout.androidaps.interfaces.PluginBase
import info.nightscout.androidaps.interfaces.PluginDescription
import info.nightscout.androidaps.interfaces.PluginType

object ActionsPlugin : PluginBase(PluginDescription()
        .mainType(PluginType.GENERAL)
        .fragmentClass(ActionsFragment::class.java.name)
        .pluginName(R.string.actions)
        .shortName(R.string.actions_shortname)
        .description(R.string.description_actions))
