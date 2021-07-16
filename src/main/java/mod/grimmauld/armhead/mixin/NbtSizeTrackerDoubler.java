package mod.grimmauld.armhead.mixin;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.NBTSizeTracker;
import net.minecraft.network.PacketBuffer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PacketBuffer.class)
public class NbtSizeTrackerDoubler {
	@Inject(at = @At("INVOKE"), method = "readCompoundTag", cancellable = true)
	private void read(CallbackInfoReturnable<CompoundNBT> cir) {
		cir.setReturnValue(((PacketBuffer) (Object) this).func_244272_a(new NBTSizeTracker(Long.MAX_VALUE)));
	}
}
