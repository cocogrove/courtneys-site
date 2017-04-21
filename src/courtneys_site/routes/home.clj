(ns courtneys-site.routes.home
  (:require [compojure.core :refer :all]
            [courtneys-site.views.layout :as layout]))

(defn home []
  (layout/common))

(defroutes home-routes
  (GET "/" [] (home)))
