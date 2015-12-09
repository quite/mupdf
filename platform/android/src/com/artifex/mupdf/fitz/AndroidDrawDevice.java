package com.artifex.mupdf.fitz;

import android.graphics.Bitmap;

public final class AndroidDrawDevice extends CDevice
{
	// Construction
	public AndroidDrawDevice(Bitmap bitmap, int pageX0, int pageY0, int pageX1, int pageY1, int patchX0, int patchY0, int patchX1, int patchY1)
	{
		nativeDevice = newNative(bitmap, pageX0, pageY0, pageX1, pageY1, patchX0, patchY0, patchX1, patchY1);
	}

	public AndroidDrawDevice(Bitmap bitmap, RectI page, RectI patch)
	{
		nativeDevice = newNative(bitmap, page.x0, page.y0, page.x1, page.y1, patch.x0, patch.y0, patch.x1, patch.y1);
	}

	private native long newNative(Bitmap bitmap, int pageX0, int pageY0, int pageX1, int pageY1, int patchX0, int patchY0, int patchX1, int patchY1);
}
