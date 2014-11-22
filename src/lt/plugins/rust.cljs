(ns lt.plugins.rust
  (:require [lt.objs.editor :as editor]
            [lt.objs.editor.pool :as pool]
            [lt.objs.command :as cmd]
            [lt.objs.proc :as proc]
            [lt.object :as object]
            [lt.objs.sidebar.clients :as scl]
            [lt.objs.dialogs :as dialogs]
            [lt.objs.console :as console]
            )
  (:require-macros [lt.macros :refer [behavior]]))

(object/object* ::rust-lang
                :tags #{:rust.lang})

(def rust (object/create ::rust-lang))
