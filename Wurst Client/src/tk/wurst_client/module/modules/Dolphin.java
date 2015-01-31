/*
 * Copyright � 2014 - 2015 | Alexander01998 | All rights reserved.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package tk.wurst_client.module.modules;

import net.minecraft.client.Minecraft;
import tk.wurst_client.module.Category;
import tk.wurst_client.module.Module;

public class Dolphin extends Module
{
	public Dolphin()
	{
		super(
			"Dolphin",
			"Automatically swims like a dolphin.",
			0,
			Category.MOVEMENT);
	}

	@Override
	public void onUpdate()
	{
		if(!getToggled())
			return;
		if(Minecraft.getMinecraft().thePlayer.isInWater() && !Minecraft.getMinecraft().gameSettings.keyBindSneak.pressed)
			Minecraft.getMinecraft().thePlayer.motionY += 0.04;
	}
}
