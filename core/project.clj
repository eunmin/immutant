;; Copyright 2014-2015 Red Hat, Inc, and individual contributors.
;;
;; Licensed under the Apache License, Version 2.0 (the "License");
;; you may not use this file except in compliance with the License.
;; You may obtain a copy of the License at
;;
;; http://www.apache.org/licenses/LICENSE-2.0
;;
;; Unless required by applicable law or agreed to in writing, software
;; distributed under the License is distributed on an "AS IS" BASIS,
;; WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
;; See the License for the specific language governing permissions and
;; limitations under the License.

(defproject org.immutant/core "2.0.0-SNAPSHOT"
  :description "Utilities shared by Immutant libs."
  :pedantic? false
  :plugins [[lein-modules "0.3.10"]]

  :dependencies [[org.clojure/java.classpath _]
                 [org.clojure/tools.reader _]]

  :profiles {:dev
             {:dependencies [[cheshire "5.3.1"]
                             [org.clojure/data.fressian "0.2.0"]]}})
