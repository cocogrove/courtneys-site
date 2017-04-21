(defproject courtneys-site "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.5.1"]
                 [environ "1.1.0"]
                 [hiccup "1.0.5"]
                 [ring/ring-defaults "0.2.3"]
                 [ring/ring-core "1.5.0"]
                 [ring/ring-jetty-adapter "1.5.0"]
                 [ring-server "0.4.0"]]
  :plugins [[lein-ring "0.9.7"]
            [lein-environ "1.1.0"]]
  :ring {:handler courtneys-site.core/app
         :init    courtneys-site.core/init
         :destory courtneys-site.core/destory}
  :hooks [envrion.leiningen.hooks]
  :profiles
  {:uberjar {:aot :all}
   :ring    {:open-browser? false,
             :stacktraces?  false,
             :auto-reload?  false}}
   :dev     {:dependencies [[javax.servlet/servlet-api "2.5"]
                            [ring/ring-devel "1.6.0-RC1"]
                            [ring/ring-mock "0.3.0"]]})
