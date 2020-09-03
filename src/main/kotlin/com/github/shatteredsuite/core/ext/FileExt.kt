package com.github.shatteredsuite.core.ext

import java.io.File

private operator fun File.get(s: String): File {
    return File(this, s)
}
