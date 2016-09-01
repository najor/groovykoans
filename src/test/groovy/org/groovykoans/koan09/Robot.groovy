/*
 * Copyright (c) 2012-2014 nadavc <https://twitter.com/nadavc>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the WTFPL, Version 2, as published by Sam Hocevar.
 * See the COPYING file for more details.
 */

package org.groovykoans.koan09

class Robot {
    // ------------ START EDITING HERE ----------------------

    int x, y

    def invokeMethod(String name, Object args) {
        if (name.startsWith('go')) {
            (name =~ /(Left|Down|Right|Up)/).each { match, dir ->
                this."${dir.toLowerCase()}"()
            }
        }
    }

    def left() {
        x--
    }

    def right() {
        x++
    }

    def up() {
        y++
    }

    def down() {
        y--
    }

    // ------------ STOP EDITING HERE  ----------------------
}
