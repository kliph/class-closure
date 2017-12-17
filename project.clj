(defproject class-closure "0.1.0-SNAPSHOT"
  :description "Graph the active set of classes for a github repo"
  :url "https://github.com/kliph/class-closure"
  :license {:name "MIT"
            :url "https://opensource.org/licenses/MIT"}
  :clean-targets ^{:protect false} [:target-path "out" "resources/public/js"]
  :min-lein-version "2.5.3"
  :repl-options {:init-ns dev.repl}
  :dependencies [[org.clojure/clojure "1.9.0-RC2"]
                 [org.clojure/clojurescript "1.9.946"]
                 [reagent "0.8.0-alpha1"]
                 [cljsjs/chartjs "2.6.0-0"]
                 [compojure "1.6.0"]
                 [ring/ring-jetty-adapter "1.6.2"]
                 [ring/ring-ssl "0.3.0"]
                 [environ "1.1.0"]]
  :plugins [[environ/environ.lein "0.3.1"]
            [lein-cljsbuild "1.1.7"]
            [lein-figwheel "0.5.13"]]
  :hooks [environ.leiningen.hooks]
  :figwheel {:css-dirs ["resources/public/css"]
             :server-port 3450}
  :uberjar-name "class_closure.jar"
  :profiles {:dev {:dependencies [[com.cemerick/piggieback "0.2.2"]
                                  [figwheel-sidecar "0.5.13"]
                                  [binaryage/devtools "0.9.4"]]
                   :source-paths ["src" "dev"]
                   :cljsbuild {:builds [{:id "dev"
                                         :source-paths ["src"]
                                         :figwheel true
                                         :compiler {:main "class-closure.core"
                                                    :preloads [devtools.preload]
                                                    :asset-path "js/out"
                                                    :output-to "resources/public/js/main.js"
                                                    :output-dir "resources/public/js/out"
                                                    :optimizations :none
                                                    :recompile-dependents true
                                                    :source-map true}}
                                        {:id "production"
                                         :source-paths ["src"]
                                         :compiler {:main "class-closure.core"
                                                    :asset-path "js/out"
                                                    :output-to "resources/public/js/main.js"
                                                    :output-dir "resources/public/js/out/prod"
                                                    :optimizations :advanced
                                                    :pretty-print false}}]}}
             :uberjar {:env {:production true}
                       :source-paths ["src"]
                       :prep-tasks ["compile" ["cljsbuild" "once"]]
                       :cljsbuild {:builds [{:id "production"
                                             :source-paths ["src"]
                                             :jar true
                                             :compiler {:main "class-closure.core"
                                                        :asset-path "js/out"
                                                        :output-to "resources/public/js/main.js"
                                                        :output-dir "resources/public/js/out"
                                                        :optimizations :advanced
                                                        :pretty-print false}}]}}})
