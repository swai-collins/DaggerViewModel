package com.alexfacciorusso.daggerviewmodel.sample

import androidx.lifecycle.ViewModel
import javax.inject.Inject

/**
 * @author alexfacciorusso
 */
class MainViewModel @Inject constructor() : ViewModel() {
    fun getSomeText() = "Hello!"
}