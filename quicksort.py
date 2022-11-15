import random
lst = [1,2,9,4,72,21]


def qsort(lst):
        if len(lst) <= 1:
            return lst
        p_ind = random.randrange(0,len(lst) - 1) 
        p = lst[p_ind]
        a= []
        b = []
        ind = 0
        while ind < len(lst):
        
            if ind == p_ind:
                ind +=1
                continue
            if lst[ind]<= p:
                a.append(lst[ind])
            else:
                b.append(lst[ind])
            ind += 1
        return qsort(a) + [p] + qsort(b)

print(qsort(lst))
        
