

;
; Complete the 'timeConversion' function below.
;
; The function is expected to return a STRING.
; The function accepts STRING s as parameter.
;
(defn timeConversion [s]
    (let [lastTwo (subs s 8 10)
          firstTwo (read-string (subs s 0 2))
          restTime (subs s 2 8)]
     (if (= lastTwo "AM")
        (if (= firstTwo 12)
            (str "00" restTime)
            (subs s 0 8))
        (str (+ firstTwo 12) restTime)))
)

(def fptr (get (System/getenv) "OUTPUT_PATH"))

(def s (read-line))

(def result (timeConversion s))

(spit fptr (str result "\n") :append true)
