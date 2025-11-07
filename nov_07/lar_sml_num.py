def lar_sml_num(list_of_nums):
  lar = 0
  sml = 0

  for num in list_of_nums:
    if lar == 0 and sml == 0:
      lar = num
      sml = num

    if num > lar:
      lar = num

    if num < sml:
      sml = num

  return lar, sml


num_list = [5, 3, 7, 8, 9, 1, 2]

lar, sml = lar_sml_num(num_list)

print("Array:", num_list)
print("The largest num is", lar)
print("The smallest num is", sml)
