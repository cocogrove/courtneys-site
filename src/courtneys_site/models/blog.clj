(ns courtneys-site.models.blog
  (:use hiccup.core)
  (:require [courtneys-site.models.common :as common]))

(def blog-data
  {"blog1" {:title "blog1"
            :description "this is a blog"}})

(defn make-slug [string]
  (clojure.string/lower-case (clojure.string/replace string #"[^a-z0-9A-Z]" "_")))

(defn post-page [blog-data]
  (html [:html
                                        ;base/head
         [:body
          common/navbar
          [:h1 (get blog-data :title)]
          [:p (get blog-data :description)]
          (get blog-data :description)]]))

(def blog-page
  (html [:html
         [:head
          [:link {:href "/css/screen.css", :rel "stylesheet", :type "text/css"}]]
         [:meta {:name "viewport" :content "width=device-width, initial-scale=1.0"}]
         [:body
          common/navbar
          [:h1 "The Beginning of Battleship (before they got ships)…"]
          [:p.entry-details "This project idea came from codeacademy.com. A very simple battleship game that doesn't do anything complicated (if you don't believe me, check out how simple the board looks.) There are two lines commented out that can tell the player where the ship is located so they can win and that came in handy for testing."
           [:br]
           [:br]
           "Start simple, get it done, be proud, spruce it up when you have the skills."]
          [:h1 "One Down, 9,999 Hours Left To Go…"]
          [:p.entry-details "About eight months ago, I made the decision to become a successful programmer and live an enlightened life of luxury. Doing one hour a day through codeacademy.com was enough to make me feel like I was headed in the right direction. At that time I was still pursuing a degree as an English major, and it was that helpless feeling of, “what am I going to do with an English degree in this economy that will get me a Tesla Roadster?” that prodded me to the tech world. And as luck would have it, I already had two siblings in the industry."
           [:br]
           [:br]
           "Using them as living examples of what I could achieve became distracting from the actual work. My brother found a stimulating career that continually challenges him to think bigger and better than the average person. My sister, who had previously studied anthropology, found a stable job that gave her the flexibility to travel more than anyone in my family. I could only imagine what was waiting for me on the other end of that … that…. Oh yeah, hard work. Programming doesn’t come easy. And I quickly learned it takes a special kind of person to do this."
           [:br]
           [:br]
           "The day before my college application was due, I came clean about my true intentions of pursuing programming instead. After an ardent discussion with my brother, I decided to go “balls to the wall” and run like hell for this career. Drop school, work, friends, and live in exile in order to focus and live distraction-free. I completed the codeacademy tutorial for Python, Learn Python the Hard Way, and LearnStreet’s Python tutorial in addition to doing some projects on my own. Those were ideal for getting my feet wet and I can confidently say that I am passed the beginner stage of Python. They weren’t excruciatingly painful; they were fun and I enjoyed treating it like a puzzle. The problem is, where do I go now? That special kind of person I mentioned earlier, the one equipped to do this, they aren’t smarter than the average person, not really. They are self-disciplined, self-motivated, and resourceful. I had to go into exile to become a professional beginner. Needless to say, I’ve gotten distracted, lazy, and lost."
           [:br]
           [:br]
           "They say it takes 10,000 hours to become an expert at anything, so now I guess I have a timeline. If you’re not practicing, you’re not growing and reaching that expert level of what you want to do. Worse than that, if you take a break, I think you lose a lot of ‘hours’ and knowledge you’ve accumulated, but that doesn’t mean you’ve given up. I’m not that special kind of person, but that just means I’ll have to learn those traits as I continue along. This blog is a reminder to keep going and will offer project ideas and code for anyone struggling the same way I am (er was… hopefully)."]]]))
