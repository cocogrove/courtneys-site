(ns courtneys-site.models.common)

(def navbar
  (list
   [:div.navbar
    [:div.left
     [:ul.directory
      [:li.directory-item [:a {:href "/blog"} "Blog"]]]]
    [:div.social-container
     [:ul.social-media
      [:li.social-media-list "Connect"
       [:ul.social-items
        [:li#twitter.social-item
         [:a.media {:target "_blank"
                    :href "https://twitter.com/courtney__grove"} "Twitter"]]]]]]
        [:h1.title [:a {:href "/"} "Courtney"]]]))
