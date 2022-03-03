(ns hello.core)

(defn greet []
  (prn "Hello world!"))

;; This is a rich comment block
;; https://betweentwoparens.com/blog/rich-comment-blocks/
(comment
  (greet))
