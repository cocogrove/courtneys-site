(ns courtneys-site.routes.home
  (:require [compojure.core :refer :all]
            [courtneys-site.views.layout :as layout]
            [courtneys-site.models.blog  :as blog]))

(defn home []
  (layout/common))

(defroutes home-routes
  (GET "/" [] (home))
  (GET "/blog" [] blog/blog-page))
