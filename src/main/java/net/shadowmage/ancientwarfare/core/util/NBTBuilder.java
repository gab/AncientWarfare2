package net.shadowmage.ancientwarfare.core.util;

import net.minecraft.nbt.NBTTagCompound;

import java.util.UUID;

public class NBTBuilder {
	private NBTTagCompound tag = new NBTTagCompound();

	public NBTBuilder setString(String key, String value) {
		tag.setString(key, value);
		return this;
	}

	public NBTBuilder setBoolean(String key, boolean value) {
		tag.setBoolean(key, value);
		return this;
	}

	public NBTTagCompound build() {
		return tag;
	}

	public NBTBuilder setByte(String key, int value) {
		tag.setByte(key, (byte) value);
		return this;
	}

	public NBTBuilder setUniqueId(String key, UUID uniqueId) {
		tag.setUniqueId(key, uniqueId);
		return this;
	}
}
