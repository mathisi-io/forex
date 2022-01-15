PROGRAM TestCallJ

    class_name = "io.mathisi.Forex"
    method_name = "calculate"
    param = "USD]2349.45"

    CALLJ class_name, method_name, param SETTING amount_fcy ON ERROR
        err = SYSTEM(0)
        CRT err
        RETURN
    END
    CRT @(-1)
    CRT "EUR 2349.45 = USD ": amount_fcy     ;* EUR 2349.45 = USD 2769.3

END
