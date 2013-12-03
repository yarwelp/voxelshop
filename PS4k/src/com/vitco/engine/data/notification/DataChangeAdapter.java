package com.vitco.engine.data.notification;

/**
 * Like DataChangeListener but overwrites all methods.
 */
public abstract class DataChangeAdapter implements DataChangeListener {

    @Override
    public void onAnimationDataChanged() {}

    @Override
    public void onAnimationSelectionChanged() {}

    @Override
    public void onVoxelDataChanged() {}

    @Override
    public void onVoxelHighlightingChanged() {}

    @Override
    public void onVoxelSelectionShiftChanged() {}

    @Override
    public void onTextureDataChanged() {}

    @Override
    public void onOutlineBoxesChanged() {}

    @Override
    public void onSelectionRectChanged() {}

    @Override
    public void onLayerStateChanged() {}
}
